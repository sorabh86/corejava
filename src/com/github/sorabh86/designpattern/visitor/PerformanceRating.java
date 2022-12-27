package com.github.sorabh86.designpattern.visitor;

public class PerformanceRating {
	
	private int employeeId;
	private int performanceRating;

	public PerformanceRating(int employeeId, int performanceRating) {
		this.employeeId = employeeId;
		this.performanceRating = performanceRating;
	}

	public void setFinalRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}

	public int getFinalRating() {
		return performanceRating;
	}

	public void setTeamAverageRating(int teamAverage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "PerformanceRating [employeeId=" + employeeId + ", performanceRating=" + performanceRating + "]";
	}

}
