package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test") //이 클래스 아래의 컨트롤러는 /test하위에 있는것으로 생각
public class Ex03Controller {
	@RequestMapping("/ex03")
	public String ex03() {
		return "ex03";
	}
	@RequestMapping("/ex05")
	public String ex05() {
		return "ex05";
	}
}
