package com.amrit.designpatterns.creational.builder.example.prompt;

public class Prompt {
	private String modelName;
	private String systemPrompt;
	private String userPrompt;
	private Double temperature;
	private Integer maxTokens;

	public Prompt(PromptBuilder promptBuilder) {
		this.modelName = promptBuilder.modelName;
		this.systemPrompt = promptBuilder.systemPrompt;
		this.userPrompt = promptBuilder.userPrompt;
		this.temperature = promptBuilder.temperature;
		this.maxTokens = promptBuilder.maxTokens;
	}

	public static class PromptBuilder {
		private String modelName;
		private String systemPrompt;
		private String userPrompt;
		private Double temperature;
		private Integer maxTokens;

		public PromptBuilder() {
			this.modelName = Constants.GPT4;
			this.systemPrompt = Constants.GPT35;
			this.temperature = Constants.DEFAULT_TEMPERATURE;
			this.maxTokens = Constants.DEFAULT_MAX_TOKEN;
		}
		
		public Prompt build() {
			return new Prompt(this);
		}

		public PromptBuilder setModelName(String modelName) {
			this.modelName = modelName;
			return this;
		}

		public PromptBuilder setSystemPrompt(String systemPrompt) {
			this.systemPrompt = systemPrompt;
			return this;
		}

		public PromptBuilder setUserPrompt(String userPrompt) {
			this.userPrompt = userPrompt;
			return this;
		}

		public PromptBuilder setTemperature(Double temperature) {
			this.temperature = temperature;
			return this;
		}

		public PromptBuilder setMaxTokens(Integer maxTokens) {
			this.maxTokens = maxTokens;
			return this;
		}
	}

	public String getModelName() {
		return modelName;
	}

	public String getSystemPrompt() {
		return systemPrompt;
	}

	public String getUserPrompt() {
		return userPrompt;
	}

	public Double getTemperature() {
		return temperature;
	}

	public Integer getMaxTokens() {
		return maxTokens;
	}

	@Override
	public String toString() {
		return "Prompt [modelName=" + modelName + ", systemPrompt=" + systemPrompt + ", userPrompt=" + userPrompt
				+ ", temperature=" + temperature + ", maxTokens=" + maxTokens + "]";
	}

	public String generateCurlString() {
		return "";
	}

}
