package com.javalive.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalive.service.ArithmeticService;


@Controller
public class ArithmeticController {

	@Autowired
	ArithmeticService service;
	private Double answer;
	@RequestMapping(value = { "/addition" }, method = RequestMethod.GET)
	public String numberAddition(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelMap model) {
		answer= service.addition(num1, num2);
		model.addAttribute("answer", answer);
		return "Addition";
	}
	@RequestMapping(value = { "/substraction" }, method = RequestMethod.GET)
	public String numberSubstraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelMap model) {
		answer= service.substraction(num1, num2);
		model.addAttribute("answer", answer);
		return "Substraction";
	}
	@RequestMapping(value = { "/multiplication" }, method = RequestMethod.GET)
	public String numberMultiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelMap model) {
		answer= service.multiplication(num1, num2);
		model.addAttribute("answer", answer);
		return "Multiplication";
	}
	@RequestMapping(value = { "/division" }, method = RequestMethod.GET)
	public String numberDivision(@RequestParam("num1") int num1, @RequestParam("num2") int num2, ModelMap model) {
		answer= service.division(num1, num2);
		model.addAttribute("answer", answer);
		return "Division";
	}
}