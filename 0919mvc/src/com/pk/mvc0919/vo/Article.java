package com.pk.mvc0919.vo;

public class Article {
	private String subject;
	private String content;
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Article [subject=" + subject + ", content=" + content + "]";
	}
	
}
