package com.github.sorabh86.designpattern.builder;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements IUserDTOBuilder {
	
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	
	private UserWebDTO dto;

	@Override
	public IUserDTOBuilder withFirstName(String fname) {
		firstName = fname;
		return this;
	}

	@Override
	public IUserDTOBuilder withLastName(String lname) {
		lastName = lname;
		return this;
	}

	@Override
	public IUserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	@Override
	public IUserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber()+", "+address.getStreet()
						+"\n"+address.getCity()+
						"\n"+address.getState()+" "+address.getZip()
						+"\n"+address.getCountry();
		return this;
	}

	@Override
	public IUserDTO build() {
		dto = new UserWebDTO(firstName+" "+lastName, address, age);
		return dto;
	}

	@Override
	public IUserDTO getUserDTO() {
		return dto;
	}
	
}
