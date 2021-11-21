package com.funcys.voyaqqer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VoyaqqerController {

	@Autowired
	private VoyaqqerService service;

	@GetMapping("/voyaqqer")
	public String getHello() {
		//voyaqqer.htmlに画面遷移
		return "voyaqqer";
	}
	@PostMapping("/voyaqqer")
	public String postRequest(@RequestParam("tweet") String str, Model model) {

		//画面から受け取った文字列をModelに登録
		model.addAttribute("tweet",str);

		//response.htmlに画面遷移
		return "response";
	}
	@PostMapping("/voyaqqer/db")
	public String postDbRequest(@RequestParam("text2")String id,Model model) {

		//1件検索
		User user = service.getUser(id);

		//検索結果をModelに登録
		model.addAttribute("user",user);

		//db.htmlに画面遷移
		return "voyaqqer/db";
	}

}
