package com.amrit.designpatterns.creational.factorymethod.example.website;

public class PaymentWebsite extends Website {

	@Override
	public void createWebsite() {
		Page paymentPage = new PaymentPage();
		addPage(paymentPage);
	}

}
