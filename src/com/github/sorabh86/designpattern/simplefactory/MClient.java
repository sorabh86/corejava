package com.github.sorabh86.designpattern.simplefactory;

public class MClient {
	public static void main(String[] args) {
		Post post = PostFactory.createPost("news");
		System.out.println(post);
	}
}
