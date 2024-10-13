package com.amrit.designpatterns.structural.bridge;

public interface BackendServer {
	public String getContent();
	public void renderContent(DisplayView view);
}
