package com.kdn.model.domain;

import java.io.Serializable;

public class Member implements Serializable{
	private int mno;	
	private String id;	
	private String pwd;	
	private String name;	
	private String dept;	
	private String mobile;	
	private String email;	
	private int penalty;
	
	public Member() { }

	public Member(int mno, String id, String pwd, String name, String dept,
			String mobile, String email) {
		this.mno = mno;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.dept = dept;
		this.mobile = mobile;
		this.email = email;
	}

	public Member(int mno, String id, String pwd, String name, String dept,
			String mobile, String email, int penalty) {
		this.mno = mno;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.dept = dept;
		this.mobile = mobile;
		this.email = email;
		this.penalty = penalty;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPenalty() {
		return penalty;
	}

	public void setPenalty(int penalty) {
		this.penalty = penalty;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Member [mno=").append(mno).append(", id=").append(id)
				.append(", pwd=").append(pwd).append(", name=").append(name)
				.append(", dept=").append(dept).append(", mobile=")
				.append(mobile).append(", email=").append(email)
				.append(", penalty=").append(penalty).append("]");
		return builder.toString();
	}
}
