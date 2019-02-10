package com.msosc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.msosc.bo.SkillBo;

@Repository
public class SkillDao {
	private final String SQL_GET_SKILLS_BY_TECHNOLOGY = "select skill_no, skill_nm, technology from skill where technology like ?";
	private final String SQL_UPD_SKILL_NM_BY_SKILL_NO = "update skill set skill_nm = ? where skill_no = ?";

	private DataSource dataSource;
	private GetSkillsByTechnology getSkillsByTechnology;
	private UpdateSkillNameBySkillNo updateSkillNameBySkillNo;

	@Autowired
	public SkillDao(DataSource dataSource) {
		this.dataSource = dataSource;
		getSkillsByTechnology = new GetSkillsByTechnology(dataSource);
		updateSkillNameBySkillNo = new UpdateSkillNameBySkillNo(dataSource);
	}

	public List<SkillBo> getSkillsByTechnology(String technology) {
		return getSkillsByTechnology.execute(technology);
	}

	public int updateSkillNameBySkillNo(int skillNo, String skillName) {
		return updateSkillNameBySkillNo.update(skillName, skillNo);
	}

	private final class GetSkillsByTechnology extends MappingSqlQuery<SkillBo> {

		public GetSkillsByTechnology(DataSource ds) {
			super(ds, SQL_GET_SKILLS_BY_TECHNOLOGY);
			declareParameter(new SqlParameter(Types.VARCHAR));
			compile();
		}

		@Override
		protected SkillBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new SkillBo(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
	}

	private final class UpdateSkillNameBySkillNo extends SqlUpdate {

		public UpdateSkillNameBySkillNo(DataSource ds) {
			super(ds, SQL_UPD_SKILL_NM_BY_SKILL_NO);
			declareParameter(new SqlParameter(Types.VARCHAR));
			declareParameter(new SqlParameter(Types.INTEGER));
			compile();
		}

	}
}
