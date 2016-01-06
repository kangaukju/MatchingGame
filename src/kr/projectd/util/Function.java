package kr.projectd.util;

import java.util.UUID;

public class Function {
	public static String getRandomString() {
		return UUID
						.randomUUID()
						.toString()
						.replaceAll("-", "");
		/*
		System.out.println(new com.eaio.uuid.UUID().toString());
		return UUID
				.fromString(new com.eaio.uuid.UUID().toString())
				.randomUUID()
				.toString()
				.replaceAll("-", "");
*/				
	}
	
	public static void main(String [] args) throws InterruptedException {
		System.out.println(getRandomString());
		System.out.println(getRandomString());
		System.out.println(getRandomString());
		System.out.println(getRandomString());		
		
	}
}
