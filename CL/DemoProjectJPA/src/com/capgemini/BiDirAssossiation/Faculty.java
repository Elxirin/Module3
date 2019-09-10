package com.capgemini.BiDirAssossiation;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Faculty {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	/*@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="techId")
	private Technology technology;//One Way
*/	
	@OneToMany(cascade = CascadeType.PERSIST, mappedBy = "faculty")
	private List<Technology> technologies = new ArrayList<>();//One to Many
	
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}
	
	/*public Technology getTechnology() {
		return technology;
	}

	public void setTechnology(Technology technology) {
		this.technology = technology;
	}
*/
	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
