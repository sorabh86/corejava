package com.github.sorabh86.designpattern.nullobject;

public class Client {

	public static void main(String[] args) {
		ComplexService service = new ComplexService(
				"Simple report 2", 
//				new StorageService()
				new NullStorageService()
			);
		service.generateReport();
	}

}
