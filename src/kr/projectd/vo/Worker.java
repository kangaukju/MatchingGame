package kr.projectd.vo;

import java.util.List;

import kr.projectd.common.JobAbility;

public class Worker {
	private String workerID;
	private String name;
	private long age;
	private String nationality;
	private String address;
	private List<JobAbility> JobAbilityList;
	
	public Worker(String name, long age, String nationality, String address, List<JobAbility> jobAbilityList) {
		super();
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		this.address = address;
		JobAbilityList = jobAbilityList;
	}
}
