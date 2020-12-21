package com.oop.employee.model.vo;

import java.util.Date;

/**
 * 캡슐화를 적용하여 를 작성하고 생성자를 통해 객체를 생성하여 초기화 하여 출력한다
 * - empNo : int
- name : String
- gender : char
- phone : String
- dept : String
- salary : int
- bonusPct : double

 Employee()
	 + Employee(empNo:int, name:String,
	  gender:char, phone:String)
	 + Employee(empNo:int, name:String,
	  gender:char, phone:String,
	  dept:String, salary:int,
	  bonusPct:couble)

setXXX
+ getXXX
+ printEmployee : void

 *
 */
public class Employee {

	private int empNo;
	private String name;
	private char gender;
	private String phone;
	private String dept;
	private int salary;
	private double bonuspct;
	
	public Employee() {
		System.out.println("Employee 객체 생성!");
	}
	
	
	public Employee(int empNo, String name, char gender, String phone) {
	  this.empNo = empNo;  
		this.name = name; 
		this.gender = gender;
		this.phone = phone;
	}


	public Employee (int empNo, String name,char gender,String phone , String dept, int salary, double bonuspct) {
		this(empNo ,name, gender, phone);
		this.dept = dept;
		this.salary = salary;
		this.bonuspct =  bonuspct;
}

	


	


	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonuspct() {
		return bonuspct;
	}
	public void setBonuspct(double bonuspct) {
		this.bonuspct = bonuspct;
	}
	
	public void printEmployee() {
		System.out.println(empNo + "," +name + "," + gender+ ","+ phone + ","+ dept +","+salary + ","+ bonuspct);
	}


	
	}




