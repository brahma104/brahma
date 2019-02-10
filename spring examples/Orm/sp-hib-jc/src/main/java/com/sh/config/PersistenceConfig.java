package com.sh.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.sh.entities.Block;

@Configuration
@ComponentScan(basePackages = { "com.sh.dao" })
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
public class PersistenceConfig {
	@Autowired
	private Environment env;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = null;

		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db.driverClassname"));
		dataSource.setUrl(env.getProperty("db.url"));
		dataSource.setUsername(env.getProperty("db.username"));
		dataSource.setPassword(env.getProperty("db.password"));

		return dataSource;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean localSessionFactoryBean = null;
		Properties hibernateProperties = null;

		hibernateProperties = new Properties();
		hibernateProperties.put("show_sql", "true");
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		hibernateProperties.put("format_sql", "true");
		hibernateProperties.put("hibernate.hbm2ddl.auto", "update");

		localSessionFactoryBean = new LocalSessionFactoryBean();
		localSessionFactoryBean.setHibernateProperties(hibernateProperties);
		localSessionFactoryBean.setAnnotatedClasses(Block.class);

		return localSessionFactoryBean;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public PlatformTransactionManager transactionManager() {
		HibernateTransactionManager hibernateTransactionManager = null;

		hibernateTransactionManager = new HibernateTransactionManager();
		return hibernateTransactionManager;
	}

	@Bean(autowire = Autowire.BY_TYPE)
	public HibernateTemplate hibernateTemplate() {
		HibernateTemplate hibernateTemplate = null;

		hibernateTemplate = new HibernateTemplate();
		return hibernateTemplate;
	}
}
