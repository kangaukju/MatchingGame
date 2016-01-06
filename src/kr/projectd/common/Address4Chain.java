package kr.projectd.common;

public class Address4Chain extends AddressChain {

	public Address4Chain() {
		super(4);
	}
	
	public Address4Chain(String addr1, String addr2, String addr3, String addr4) throws Exception {
		super(4);
		setAddr(0, addr1);
		setAddr(1, addr2);
		setAddr(2, addr3);
		setAddr(3, addr4);
	}
}
