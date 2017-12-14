package jdte.friendmatch.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {

	/**
	 * 首页跳转
	 * @return
	 */
	@RequestMapping(value = {"login"})
	public String login() {
		return "login";
	}
	@RequestMapping(value = {"/", "index"})
	public String index() {
		return "index";
	}
	
}
