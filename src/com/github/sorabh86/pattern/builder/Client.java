package com.github.sorabh86.pattern.builder;

import java.time.LocalDate;

//This is out client which also work as "director"
public class Client {
	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		UserDTO dto = directorBuild(builder, user);
		System.out.println(dto);
	}
	
	//Director using the builder
	private static UserDTO directorBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthday(user.getBirthday())
				.build();
	}
	
	/**
	 * @return -Sample User
	 */
	static User createUser() {
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
