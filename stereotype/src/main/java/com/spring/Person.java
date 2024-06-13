package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per")
	 public class Person{
		 
		 @Value("101")
		 private int id;
		 
		 @Value("Sourabh")
		 private String name;
		 
		 @Value("#{accounts}")
		 private List<String> accounts;
		public Person() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Person(int id, String name, List<String> accounts) {
			super();
			this.id = id;
			this.name = name;
			this.accounts = accounts;
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
		public List<String> getAccounts() {
			return accounts;
		}
		public void setAccounts(List<String> accounts) {
			this.accounts = accounts;
		}
		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", accounts=" + accounts + "]";
		}
		
}
