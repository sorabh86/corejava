package com.github.sorabh86.designpattern.adapter;

public class Main {

	public static void main(String[] args) {
		// Class/Two-way adapter
		EmployeeClassAdapter adapter = new EmployeeClassAdapter();
		populateEmployeeData(adapter);
		BusinessCardDesigner designer = new BusinessCardDesigner();
		String card = designer.designCard(adapter);
		System.out.println(card);
		
		System.out.println("---------");
		
		// Object adapter
		Employee emp = new Employee();
		populateEmployeeData(emp);
		EmployeeObjectAdapter adapter2 = new EmployeeObjectAdapter(emp);
		card = designer.designCard(adapter2);
		System.out.println(card);
	}

	private static void populateEmployeeData(Employee employee) {
		employee.setFullName("Sorabh Sharma("+employee.toString()+")");
		employee.setJobTitle("Software Engineer");
		employee.setOfficeLocation("Ghaziabad, India");
	}
}
