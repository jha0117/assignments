package com.samsung.hw.vo;

public class hUserVO {
	private int seq;
	private String name;
	private String password;
	private String email;
	private int age;
	private int gender;
	public hUserVO() {
	}
	public hUserVO(int seq, String name, String password, String email,
			int age, int gender) {
		super();
		this.seq = seq;
		this.name = name;
		this.password = password;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "hUserVO [seq=" + seq + ", name=" + name + ", password="
				+ password + ", email=" + email + ", age=" + age + ", gender="
				+ gender + "]";
	}
}
