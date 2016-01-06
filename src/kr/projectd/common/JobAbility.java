package kr.projectd.common;

import java.util.ArrayList;
import java.util.List;

public class JobAbility {
	
	static public enum JOB_CATEGORY {
		DELIVERY,
		KITCHEN,
		SERVING
	}
	
	static private long jobcode = 0;
	
	static private List<JobAbility> defaultAvailableJobs = new ArrayList<JobAbility>();
	
	static {		
		defaultAvailableJobs.add(new JobAbility(JOB_CATEGORY.DELIVERY, jobcode++, "배달"));
		defaultAvailableJobs.add(new JobAbility(JOB_CATEGORY.KITCHEN, jobcode++, "찬모/밥모"));
		defaultAvailableJobs.add(new JobAbility(JOB_CATEGORY.KITCHEN, jobcode++, "세척/다듬기"));
		defaultAvailableJobs.add(new JobAbility(JOB_CATEGORY.SERVING, jobcode++, "홀서빙"));
	}
	
	private JOB_CATEGORY jobCategory;
	private long jobCode;
	private String jobName;
	
	public JobAbility(JOB_CATEGORY jobCategory, long jobCode, String jobName) {
		this.jobCategory = jobCategory;
		this.jobCode = jobCode;
		this.jobName = jobName;
	}
	
	public static void addJobAbility(JOB_CATEGORY jobCategory, String jobName) {
		defaultAvailableJobs.add(new JobAbility(jobCategory, jobcode++, "배달"));
	}
	
	public static JobAbility[] getAvailableJobAbilities() {
		return defaultAvailableJobs.toArray(new JobAbility[defaultAvailableJobs.size()]);
	}
	
	@Override
	public String toString() {
		return "JobAbility [jobCategory=" + jobCategory + ", jobCode=" + jobCode + ", jobName=" + jobName + "]";
	}
	
	
	
	
	public static void main(String [] args) {	
		for (JobAbility j : JobAbility.getAvailableJobAbilities()) {
			System.out.println(j);
		}
	}
}
