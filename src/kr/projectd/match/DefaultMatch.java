package kr.projectd.match;

public abstract class DefaultMatch {
	private String name;
	private long matchPoint;
	private long matchPointUnit;
	
	public DefaultMatch(String name, long matchPointUnit) {
		this.name = name;
		this.matchPointUnit = matchPointUnit;
		this.matchPoint = 0;
	}	
	
	public String getName() {
		return name;
	}
	
	public void mathcUP() {
		matchPoint += matchPointUnit;
	}
	
	public void mathcDOWN() {
		matchPoint -= matchPointUnit;
		if (matchPoint < 0) {
			matchPoint = 0;
		}
	}

	public long getMatchPoint() {
		return matchPoint;
	}
}
