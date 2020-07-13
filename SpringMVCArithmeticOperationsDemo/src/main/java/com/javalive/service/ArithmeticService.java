package com.javalive.service;

import org.springframework.stereotype.Service;

@Service("arithmeticService")
public class ArithmeticService {
	public double addition(int num1, int num2) {
		return num1 + num2;
	}

	public double substraction(int num1, int num2) {
		return num1 - num2;
	}

	public double multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public double division(int num1, int num2) {
		return num1 / num2;
	}
}
