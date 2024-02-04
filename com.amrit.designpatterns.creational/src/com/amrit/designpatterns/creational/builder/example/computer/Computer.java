package com.amrit.designpatterns.creational.builder.example.computer;

public class Computer {
	private RAM ram;
	private HDD hdd;
	private String brand;
	private boolean hasVideoCard;

	public Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.brand = builder.brand;
		this.hasVideoCard = builder.hasVideoCard;
	}

	public static class ComputerBuilder {
		private RAM ram;
		private HDD hdd;
		private String brand;
		private boolean hasVideoCard;

		public ComputerBuilder() {

		}

		public Computer build() {
			return new Computer(this);
		}

		public ComputerBuilder setRam(RAM ram) {
			this.ram = ram;
			return this;
		}

		public ComputerBuilder setHdd(HDD hdd) {
			this.hdd = hdd;
			return this;
		}

		public ComputerBuilder setBrand(String brand) {
			this.brand = brand;
			return this;
		}

		public ComputerBuilder setHasVideoCard(boolean hasVideoCard) {
			this.hasVideoCard = hasVideoCard;
			return this;
		}
	}

	public RAM getRam() {
		return ram;
	}

	public HDD getHdd() {
		return hdd;
	}

	public String getBrand() {
		return brand;
	}

	public boolean isHasVideoCard() {
		return hasVideoCard;
	}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", hdd=" + hdd + ", brand=" + brand + ", hasVideoCard=" + hasVideoCard + "]";
	}

}
