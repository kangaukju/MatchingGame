package kr.projectd.vo;

import java.util.ArrayList;
import java.util.List;

import kr.projectd.common.Address;
import kr.projectd.common.JobAbility;
import kr.projectd.common.JobAbility.JOB_CATEGORY;
import kr.projectd.match.DefaultMatch;
import kr.projectd.match.HardMatch;
import kr.projectd.match.MatchList;
import kr.projectd.match.SoftMatch;

public class Recruitment {
	private Business business;
	private String recruitmentID;
	private MatchList<HardMatch> hardMatchList;
	private MatchList<SoftMatch> softMatchList;
	
	public Recruitment(Business business) {
		this.business = business;
		this.recruitmentID = null;
		hardMatchList = new MatchList<HardMatch>();
		softMatchList = new MatchList<SoftMatch>();
	}	
	
	public boolean addMatch(DefaultMatch m) {
		if (HardMatch.class.isAssignableFrom(m.getClass())) {
			hardMatchList.add((HardMatch)m);
		} else if (SoftMatch.class.isAssignableFrom(m.getClass())) {
			softMatchList.add((SoftMatch)m);
		}
		return false;
	}
	
	public boolean removeMatch(String key) {
		if (hardMatchList.remove(key) || softMatchList.remove(key)) {
			return true;
		}
		return false;
	}

	public String getRecruitmentID() {
		return recruitmentID;
	}
	
	
	
	public static void main(String [] args) throws Exception {
		Address BEaddress = new Address("송죽동", 37.303938, 127.010177);
		Business BE = new Business("태장마루 감자탕 24", BEaddress);
		
		List<JobAbility> jobAbilityList = new ArrayList<JobAbility>();
		jobAbilityList.add(new JobAbility(JOB_CATEGORY.KITCHEN))
		
		Worker WE = new Worker("강석주", 34, "KOREAN", "강남구", jobAbilityList)
	}
	
}
