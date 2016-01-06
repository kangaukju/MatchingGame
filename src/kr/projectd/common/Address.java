package kr.projectd.common;

public class Address {
	private String address;
	private double lat;
	private double lng;

	public Address(String address, double lat, double lng) {
		super();
		this.address = address;
		this.lat = lat;
		this.lng = lng;
	}

	public String getAddress() {
		return address;
	}

	public double getLat() {
		return lat;
	}

	public double getLng() {
		return lng;
	}

	@Override
	public String toString() {
		return "Address [address=" + address + ", lat=" + lat + ", lng=" + lng + "]";
	}

}
