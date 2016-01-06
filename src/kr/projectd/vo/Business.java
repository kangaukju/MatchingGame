package kr.projectd.vo;

import kr.projectd.common.Address;

public class Business {
	private String businessID;
	private String name;
	private Address address;
	
	public Business(String name, Address address) {
		this.name = name;
		this.address = address;
	}
}
