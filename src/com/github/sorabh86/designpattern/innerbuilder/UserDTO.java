package com.github.sorabh86.designpattern.innerbuilder;

import java.time.LocalDate;
import java.time.Period;

import com.github.sorabh86.designpattern.builder.Address;

// Product class
public class UserDTO {
	
	private String name;
	private String address;
	private String age;
	
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	public String getAge() {
		return age;
	}
	private void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	
	// Get Builder instance
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}
	
	// Builder
	public static class UserDTOBuilder {
		private String firstName;
		private String lastName;
		private String age;
		private String address;
		
		private UserDTO userDTO;
		
		public UserDTOBuilder withFirstName(String fname) {
			firstName = fname;
			return this;
		}
		public UserDTOBuilder withLastName(String lname) {
			lastName = lname;
			return this;
		}
		public UserDTOBuilder withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}
		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber()+" "+address.getStreet()
						+"\n"+address.getCity()+", "+address.getState()+" "+address.getZip();
			return this;
		}
		
		public UserDTO build() {
			this.userDTO = new UserDTO();
			this.userDTO.setName(firstName+" "+lastName);
			this.userDTO.setAge(age);
			this.userDTO.setAddress(address);
			return this.userDTO;
		}
		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}
