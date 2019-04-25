package org.jinseon.book.chap03;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MemberMainUsingSpring {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"chap03.xml");
		MemberRegisterService regService = ctx.getBean("memberRegisterService",
				MemberRegisterService.class);

		// registerRequest 
		RegisterRequest req = new RegisterRequest();
		req.setEmail("jinseon@naver.com");
		req.setPassword("xxxx");
		req.setName("Jinseon");


		regService.regist(req);
		ctx.close();
	}
}

