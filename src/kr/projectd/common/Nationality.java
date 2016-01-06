package kr.projectd.common;

public class Nationality {
	
	static public enum NATIONAL_CODE {
		KOREAN,
		OVERSEA_KOREAN,
		ASIAN,
		ETC,
	}

	private NATIONAL_CODE nationalCode;

	public Nationality(NATIONAL_CODE nationalCode) {
		super();
		this.nationalCode = nationalCode;
	}

	public NATIONAL_CODE getNationalCode() {
		return nationalCode;
	}
}
