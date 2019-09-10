package com.capgemini.BiDirAssossiation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Technology {
	@Id
	@GeneratedValue
	private int technologyId;
	private String technologyName;
	
	@ManyToOne
	private Faculty faculty;
	
	/*@OneToOne(cascade = CascadeType.ALL, mappedBy = "technology")
	@JoinColumn(name="facId")
	private Faculty faculty;//Two Way - BiDirectional
	
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}*/
	
	
	
	
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public int getTechnologyId() {
		return technologyId;
	}
	@Override
	public String toString() {
		return "Technology [technologyId=" + technologyId + ", technologyName=" + technologyName + "]";
	}
	public void setTechnologyId(int technologyId) {
		this.technologyId = technologyId;
	}
	public String getTechnologyName() {
		return technologyName;
	}
	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
}
