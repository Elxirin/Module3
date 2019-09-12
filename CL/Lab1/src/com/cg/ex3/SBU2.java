package com.cg.ex3;

import java.util.List;

public class SBU2 {

	private String sbuCode;
	private String sbuName;
	private String sbuHead;
	private List<Employee2> empList;
	
	public List<Employee2> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee2> empList) {
		this.empList = empList;
	}
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuId) {
		this.sbuCode = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	
	@Override
	public String toString() {
		return "SBU2 [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	
}
