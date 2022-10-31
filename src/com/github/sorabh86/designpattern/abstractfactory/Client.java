package com.github.sorabh86.designpattern.abstractfactory;

import com.github.sorabh86.designpattern.abstractfactory.Instance.Capacity;

public class Client {

	private ResourceFactory factory;

	public Client(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMb) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMb);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
		Client aws = new Client(new AWSResourceFactory());
		Instance i1 = aws.createServer(Capacity.micro, 20480); //20GB
		i1.start();
		i1.stop();
		
		System.out.println();
		Client gcp = new Client(new GoogleResourceFactory());
		i1 = gcp.createServer(Capacity.large, 40960); //40GB
		i1.start();
		i1.stop();
	}
}
