package com.springJdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.springJdbc.Entity.Student;

public class StudentDaoImp implements StudentDao {
	
private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		
		String query="insert into Student values(?,?,?)";
	 int r=	this.jdbcTemplate.update(query,student.getId(),student.getSname(),student.getAddress());
		
	
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	

}
