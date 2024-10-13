package com.amrit.designpatterns.structural.bridge;

public class MyServer implements BackendServer {
	private final String content;
	
	public MyServer(String content) {
		this.content = content;
	}

	@Override
	public String getContent() {
		return this.content;
	}

	@Override
	public void renderContent(DisplayView view) {
		view.display(content);
	}
	
}
