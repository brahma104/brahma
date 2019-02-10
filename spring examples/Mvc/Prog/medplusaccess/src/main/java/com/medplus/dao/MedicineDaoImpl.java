package com.medplus.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.medplus.bo.MedicineBo;

public class MedicineDaoImpl implements MedicineDao {
	private final String SQL_GET_MEDICINES = "select medicine_no, medicine_nm, manufacturer, price, quantity, expiry_month, expiry_year from medicine order by medicine_nm";

	private JdbcTemplate jdbcTemplate;

	public MedicineDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<MedicineBo> getMedicines() {
		return jdbcTemplate.query(SQL_GET_MEDICINES, new MedicineRowMapper());
	}

	private final class MedicineRowMapper implements RowMapper<MedicineBo> {
		@Override
		public MedicineBo mapRow(ResultSet rs, int rowNum) throws SQLException {
			MedicineBo bo = null;

			bo = new MedicineBo();
			bo.setMedicineNo(rs.getInt(1));
			bo.setMedicineName(rs.getString(2));
			bo.setManufacturer(rs.getString(3));
			bo.setPrice(rs.getFloat(4));
			bo.setQuantity(rs.getInt(5));
			bo.setExpiryMonth(rs.getInt(6));
			bo.setExpiryYear(rs.getInt(7));
			return bo;
		}

	}
}
