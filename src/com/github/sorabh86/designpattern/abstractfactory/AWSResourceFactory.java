package com.github.sorabh86.designpattern.abstractfactory;

import com.github.sorabh86.designpattern.abstractfactory.Instance.Capacity;

// Factory implementation for Amazon Web Service
public class AWSResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capInMb) {
		return new S3Storage(capInMb);
	}

}
