package com.practice;

import java.text.NumberFormat;

import java.util.Locale;

public class CurrencyFormatter {

	public static void main(String[] args) {
		NumberFormat in = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		double money = 1233434.00;
		System.out.println(us.format(money));
		System.out.println(in.format(money));
		System.out.println(china.format(money));
		System.out.println(france.format(money));
	}
}


