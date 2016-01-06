package kr.projectd.common;

import java.util.Vector;

public class AddressChain {
	private Vector<String> addrChain;
	private int depth;
	
	public AddressChain(int depth) {
		this.depth = depth;
		addrChain = new Vector<String>(depth);
		addrChain.setSize(depth);
	}
	
	public void setAddr(int idx, String addr) throws Exception {
		if (idx >= depth) {
			throw new Exception("address depth is over (max depth: "+depth+")");
		}
		// check duplicated
		if (addrChain.get(idx) != null) {
			throw new Exception("already assigned address (address["+idx+"]: "+addrChain.get(idx)+")");
		}
		addrChain.set(idx, addr);
	}
	
	public String getAddr(int idx) throws Exception {
		if (idx >= depth) {
			throw new Exception("address depth is over (max depth: "+depth+")");
		}
		return addrChain.get(idx).toString();
	}
	
	public String fullAddress() {
		StringBuffer sb = new StringBuffer();
		for (int i=0; i<addrChain.size(); i++){
			if (i > 0) {
				sb.append(" ");	
			}
			sb.append(addrChain.get(i));
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "Address [depth=" + depth + ", fullAddress()=" + fullAddress() + "]";
	}
	
	public static void main(String [] args) throws Exception {
		AddressChain testAddr = new AddressChain(3);
		testAddr.setAddr(0, "Seoul");
		testAddr.setAddr(1, "GangNamGu");
		testAddr.setAddr(2, "NonHuyen");
		System.out.println(testAddr);
	}
}
