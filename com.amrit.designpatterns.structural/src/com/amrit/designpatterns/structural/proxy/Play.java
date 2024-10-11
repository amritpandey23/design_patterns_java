package com.amrit.designpatterns.structural.proxy;

import java.lang.reflect.Proxy;

public class Play {
	public static void main(String[] args) {
		SensitiveResource resource = new Resource();

		// Java proxy instance for resource object
		SensitiveResource proxyResource = (SensitiveResource) Proxy.newProxyInstance(resource.getClass().getClassLoader(),
				new Class<?>[] { SensitiveResource.class }, new LoggingInvocationHandler(resource));
		
		proxyResource.doIt("This is my message");
	}
}
