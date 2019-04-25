package org.jinseon.book.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");

		ArticleService articleService = ctx.getBean("articleService", org.jinseon.book.example.ArticleService.class);
		MemberService memberService = ctx.getBean("memberService", org.jinseon.book.example.MemberService.class);
		articleService.addArticle();
		memberService.registerMember();

		ctx.close();
	}

}
