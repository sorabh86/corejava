package io.github.sorabh86.overflow;

public class CheckStatic {
	
	static class B {
		static String getText() {
			return "hello";
		}
	}
	static class A extends B {
		static String getText() {
			return "world";
		}
	}

	public static void main(String[] args) {
		B b = new A();
		A a = null;
		
		System.out.println(B.getText() +' '+a.getText());

	}

}
