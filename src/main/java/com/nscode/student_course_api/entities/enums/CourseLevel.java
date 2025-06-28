package com.nscode.student_course_api.entities.enums;

public enum CourseLevel {

	BEGINNER(1),
	INTERMEDIATE(2),
	ADVANCED(3);

	private Integer code;
	
	private CourseLevel(int i) {
		
	}

	private Integer getCode() {
		return code;
	}

	public static CourseLevel valueOf(Integer code) {
		
		for(CourseLevel x : CourseLevel.values()) {
			if(code.equals(x.getCode())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Code invalid");
	}
	
	
	
}
