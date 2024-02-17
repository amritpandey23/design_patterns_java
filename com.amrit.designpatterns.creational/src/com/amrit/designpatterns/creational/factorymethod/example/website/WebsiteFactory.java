package com.amrit.designpatterns.creational.factorymethod.example.website;

public class WebsiteFactory {
	public static Website getWebsite(WebsiteType websiteType) {
		switch (websiteType) {
		case PAYMENT:
			return new PaymentWebsite();
		case ABOUT:
			return new AboutWebsite();
		}
		return null;
	}
}
