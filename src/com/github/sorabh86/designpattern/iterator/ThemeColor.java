package com.github.sorabh86.designpattern.iterator;

// This enum represents the aggregate form iterator pattern
public enum ThemeColor {
	red,
	orange,
	blue,
	black,
	green,
	white;
	
	public static Iterator<ThemeColor> getIterator() {
		return new ThemeColorIterator();
	}
	
	private static class ThemeColorIterator implements Iterator<ThemeColor> {

		private int position;
		
		@Override
		public boolean hasNext() {
			return position < ThemeColor.values().length;
		}

		@Override
		public ThemeColor next() {
			return ThemeColor.values()[position++];
		}
		
	}
}
