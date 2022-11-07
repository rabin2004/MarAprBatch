package javaBasics;

public class StringBuilderStringBuffer {
	
	// StringBuilder & StringBuffer - helper class for String

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("David Johns");
		System.out.println(sb.reverse());

		StringBuffer sbu = new StringBuffer("David Johns");
		System.out.println(sbu.delete(10, 11));
	}

}
