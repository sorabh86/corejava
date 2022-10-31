package com.github.sorabh86.designpattern.builder;

import java.time.LocalDate;

// Abstract Builder
public interface IUserDTOBuilder {
	//Methods to build "parts" of product at a time
	IUserDTOBuilder withFirstName(String fname);
	IUserDTOBuilder withLastName(String lname);
	IUserDTOBuilder withBirthday(LocalDate date);
	IUserDTOBuilder withAddress(Address address);
	
	//Method to "assemble" final product
	IUserDTO build();
	//method to fetch already built object (optional)
	IUserDTO getUserDTO();
}
