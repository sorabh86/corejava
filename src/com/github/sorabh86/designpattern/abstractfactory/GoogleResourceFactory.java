package com.github.sorabh86.designpattern.abstractfactory;

import com.github.sorabh86.designpattern.abstractfactory.Instance.Capacity;

//Factory implementation for Google Cloud Platform
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new ComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capInMb) {
		return new GoogleCloudStorage(capInMb);
	}

}
