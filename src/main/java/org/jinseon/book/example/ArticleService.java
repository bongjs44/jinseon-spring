package org.jinseon.book.example;

public class ArticleService {
	MemberDao memberDao;

	
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void addArticle() {
		memberDao.getMember();
	}
}