package org.jinseon.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();


		RegisterRequest req = new RegisterRequest();
		req.setEmail("bongjs44@naver.com");
		req.setPassword("xxxx");
		req.setName("Jinseon");

		regService.regist(req);
	}
}

