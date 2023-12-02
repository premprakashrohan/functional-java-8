package com.ki.functionalIntr.collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.ki.random.RandomAll;

public class Employee {
	private Integer eNo;
	private String eName;
	private double salary;
	private Integer deptId;
	private boolean status; 

	public void seteNo(Integer eNo) {
		this.eNo = eNo;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Employee(Integer eNo, String eName, double salary, Integer deptId, boolean status) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.salary = salary;
		this.deptId = deptId;
		this.status = status;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(Integer eNo, String eName, double salary, String deptId, boolean status) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.salary = salary;
		this.status = status;
	}

	public double getSalary() {
		return salary;
	}

	public Employee(Integer eNo, String eName) {
		super();
		this.eNo = eNo;
		this.eName = eName;
	}

	public Employee() {
		super();
	}

	public Employee(Integer eNo, String eName, double salary) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.salary = salary;
	}

	public Integer geteNo() {
		return eNo;
	}

	public String geteName() {
		return eName;
	}

	@Override
	public String toString() {
		return "Employee [eNo=" + eNo + ", eName=" + eName + ", salary=" + salary + "]";
	}

	public static EmployeeBuilder getBuilder() {
		return new EmployeeBuilder();
	}

	private static class EmployeeBuilder {
		private Integer eNo;
		private String eName;
		private double salary;

		public EmployeeBuilder withENo(Integer _eNo) {
			this.eNo = _eNo;
			return this;
		}

		public EmployeeBuilder witheNo(Integer eNo) {
			this.eNo = eNo;
			return this;
		}

		public EmployeeBuilder witheName(String eName) {
			this.eName = eName;
			return this;
		}

		public EmployeeBuilder withSalary(double salary) {
			this.salary = salary;
			return this;
		}

		public Employee build() {
			return new Employee(eNo, eName, salary);
		}

		public Employee buildRandom(Integer number) {
			return new Employee(eNo, eName, salary);
		}
	}

	public static void main(String[] args) {
		Employee.getBuilder().witheNo(1).witheName("Hello").withSalary(2000).build();
	}
}
