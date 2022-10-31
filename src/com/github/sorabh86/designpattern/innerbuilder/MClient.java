package com.github.sorabh86.designpattern.innerbuilder;

import java.time.LocalDate;

import com.github.sorabh86.designpattern.builder.Address;
import com.github.sorabh86.designpattern.builder.User;
import com.github.sorabh86.designpattern.innerbuilder.UserDTO.UserDTOBuilder;

public class MClient {
	public static void main(String[] args) {
		User user = getSampleUser();
		
		// Providing director with concrete builder
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		
		System.out.println(dto.getClass()+" "+dto);
	}
	
	//Director method
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthday(user.getBirthday())
				.build();
	}
	
	// Sample User
	private static User getSampleUser() {
		User user = new User();
		user.setFirstName("Sorabh");
		user.setLastName("Sharma");
		user.setBirthday(LocalDate.of(1999,2,3));
		Address address = new Address();
		address.setHouseNumber("B234");
		address.setStreet("123 street");
		address.setCity("Delhi");
		address.setCountry("India");
		address.setZip("393943");
		user.setAddress(address);
		return user;
	}
}
