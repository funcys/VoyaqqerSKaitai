package com.funcys.voyaqqer;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoyaqqerService {

	@Autowired
	private VoyaqqerRepository repository;

	/*Voyaqqerユーザを一人取得する*/
	public User getUser(String id) {
		//検索
		Map<String,Object> map = repository.findById(id);

		//Mapから値を取得
		String userId = (String)map.get("userId");
		String userName = (String)map.get("userName");
		int userAge = (Integer)map.get("userAge");

		//Userクラスに値をセット
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserAge(userAge);

		return user;

	}

}
