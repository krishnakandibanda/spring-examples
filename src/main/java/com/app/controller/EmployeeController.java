package com.app.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public ModelAndView showPage() {

		ModelAndView m = new ModelAndView();

		m.setViewName("Home");

		m.addObject("eid", 55);

		Employee e = new Employee(15,"Krishna",2.36);

		m.addObject("emp",e);

		List<Employee> listData = Arrays.asList(
				new Employee(12, "Nandhu", 5.6),
				new Employee(13, "Sushma", 7.6),
				new Employee(14, "kvk", 2.8),
				new Employee(15, "Ksdf", 5.6)
				);

		m.addObject("empList", listData);

		return m;

	}
}
