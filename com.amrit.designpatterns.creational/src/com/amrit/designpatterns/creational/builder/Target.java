package com.amrit.designpatterns.creational.builder;

public class Target<T> {
	private T key;

	/*
	 * Initialize constructor by passing builder
	 * object. Not like passing typical parameters.
	 */
	public Target(TargetBuilder<T> builder) {
		this.key = (T) builder.key;
	}

	public static class TargetBuilder<T> {
		private T key;

		public TargetBuilder() {
		}

		public Target<T> build() {
			return new Target<T>(this);
		}

		/*
		 * Return the object itself to attain
		 * chaining.
		 */
		public TargetBuilder<T> setKey(T value) {
			this.key = value;
			return this;
		}
	}
	
	/*
	 * Remove all setter for attaining immutability.
	 */

	public T getKey() {
		return this.key;
	}
}