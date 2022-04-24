package com.funcys.voyaqqer;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VoyaqqerRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Map<String, Object>findById(String id) {

		//SELECT文
		String query = "select *"
				+ " from user"
				+ " where userId=?";

		//検索実行
		Map<String,Object> user = jdbcTemplate.queryForMap(query,id);
		return user;

	}
}
