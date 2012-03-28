package com.xiaobing.many2many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {

	private Integer id;
	private String name;
	private Set<Teacher> teachers = new HashSet<Teacher>();

	public Student(){}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	@Id @GeneratedValue
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length=10,nullable=false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//由学生维护关联关系
	@ManyToMany(cascade=CascadeType.REFRESH)
	@JoinTable(name="teacher_student",
			inverseJoinColumns=@JoinColumn(name="teacher_id"),
			joinColumns=@JoinColumn(name="student_id"))
	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}
	
	public void addTeacher(Teacher teacher){
		this.teachers.add(teacher);
	}
	
	public void removeTeacher(Teacher teacher){
		if (this.teachers.contains(teacher)) {
			this.teachers.remove(teacher);
		}
	}

	
}
