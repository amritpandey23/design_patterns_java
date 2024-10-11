package com.amrit.designpatterns.structural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LoggingInvocationHandler implements InvocationHandler {
	private Object target;

	public LoggingInvocationHandler(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// logging the class run
		System.out.println(target.getClass().getName() + " ran method '" + method.getName() + "' with arguments: "
				+ Arrays.toString(args));
		return method.invoke(target, args);
	}

}
