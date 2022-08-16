package com.cg.start.entites;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.cg.start.entites.Employee;

	@Entity
	@Table(name="mgr_store")
	public class Manager extends Employee {
		
		private static long SerialVersionUID=1L;
		
		private String departmentName;

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		
		

	}
