package com.nscode.student_course_api.entities;

import java.io.Serializable;
import java.util.Objects;

import com.nscode.student_course_api.entities.enums.CourseLevel;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String name;
	private Integer credits;

	@Enumerated(EnumType.STRING)
	private CourseLevel courseLevel;

	public Course() {
		super();
	}

	public Course(Integer id, String name, Integer credits, CourseLevel courseLevel) {
		super();
		this.id = id;
		this.name = name;
		this.credits = credits;
		this.courseLevel = courseLevel;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public CourseLevel getCourseLevel() {
		return courseLevel;
	}

	public void setCourseLevel(CourseLevel courseLevel) {
		this.courseLevel = courseLevel;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(id, other.id);
	}

}
