package com.kita.second.level2;

public class Movie extends Netflix{
	
	public Movie(int maxChapter) {
		super(maxChapter);
	}
	
	@Override
	boolean watch() {
		++chapter;
		if(chapter <= maxChapter) {
			System.out.println("영화를 시청한다.");
			return true;
		}
		System.out.println("영화를 다 시청했다.");
		return false;
	}
	
}
