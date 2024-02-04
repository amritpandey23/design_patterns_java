package com.amrit.designpatterns.creational.builder.example.computer;

public class Play {
	public static void main(String[] args) {
		Computer.ComputerBuilder cb = new Computer.ComputerBuilder();
		cb.setRam(RAM.DDR3);
		cb.setHdd(HDD.LARGE);
//		cb.setBrand("Lenovo");
		cb.setHasVideoCard(true);
		
		Computer c = cb.build();
		System.out.println(c.toString());
	}
}
