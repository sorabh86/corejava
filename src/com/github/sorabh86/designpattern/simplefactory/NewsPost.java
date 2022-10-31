package com.github.sorabh86.designpattern.simplefactory;

import java.time.LocalDate;

public class NewsPost extends Post {
	
	private String headline;
	private LocalDate newsTime;
	public String getHeadline() {
		return headline;
	}
	public void setHeadline(String headline) {
		this.headline = headline;
	}
	public LocalDate getNewsTime() {
		return newsTime;
	}
	public void setNewsTime(LocalDate newsTime) {
		this.newsTime = newsTime;
	}
	@Override
	public String toString() {
		return "NewsPost [headline=" + headline + ", newsTime=" + newsTime + "]";
	}
}
