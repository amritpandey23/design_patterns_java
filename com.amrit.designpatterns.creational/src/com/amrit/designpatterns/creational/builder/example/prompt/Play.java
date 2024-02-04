package com.amrit.designpatterns.creational.builder.example.prompt;

public class Play {
	public static void main(String[] args) {
		Prompt.PromptBuilder builder = new Prompt.PromptBuilder();
		builder.setUserPrompt("What is 1+1");
		Prompt prompt = builder.build();
		System.out.println(prompt.toString());
	}
}
