package com.bit.day05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test") //�� Ŭ���� �Ʒ��� ��Ʈ�ѷ��� /test������ �ִ°����� ����
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
