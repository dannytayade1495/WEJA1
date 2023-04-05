package com.jspiders.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jspiders.springmvc.pojo.AdminPOJO;
import com.jspiders.springmvc.pojo.EmployeePOJO;
import com.jspiders.springmvc.service.AdminService;
import com.jspiders.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@Autowired
	private AdminService adminService;

	// Home Controller
	@GetMapping("/home")
	public String home() {
		return "Home";
	}

	// Add Page Controller
	@GetMapping("/add")
	public String addPage() {
		return "Add";
	}

	// Add Data Controller
	@PostMapping("/add")
	public String add(@RequestParam String name, @RequestParam String email, @RequestParam long contact,
			@RequestParam String designation, @RequestParam double salary, ModelMap map) {
		EmployeePOJO employee = service.addEmployee(name, email, contact, designation, salary);
		if (employee != null) {
			// Success response
			map.addAttribute("msg", "Data added successfully..!!");
			return "Add";
		}
		// Failure response
		map.addAttribute("msg", "Data not added successfully..!!");
		return "Add";
	}

	// Search Page Controller
	@GetMapping("/search")
	public String searchPage() {
		return "Search";
	}

	// Search Data Controller
	@PostMapping("/search")
	public String search(@RequestParam int id, ModelMap map) {
		EmployeePOJO employee = service.search(id);
		if (employee != null) {
			// Success Response
			map.addAttribute("msg", "Employee record found successfully..!!");
			map.addAttribute("emp", employee);
			return "Search";
		}
		// Failure Response
		map.addAttribute("msg", "Employee record not found..!!");
		return "Search";
	}

	// Remove Page Controller
	@GetMapping("/remove")
	public String remove(ModelMap map) {
		List<EmployeePOJO> employees = service.searchAllEmployees();
		map.addAttribute("empList", employees);
		return "Remove";
	}

	// Remove Data Controller
	@PostMapping("/remove")
	public String remove(@RequestParam int id, ModelMap map) {
		EmployeePOJO employee = service.search(id);
		if (employee != null) {
			// Success Response
			service.removeEmployee(id);
			List<EmployeePOJO> employees = service.searchAllEmployees();
			map.addAttribute("empList", employees);
			map.addAttribute("msg", "Employee removed successfully..!!");
			return "Remove";
		}
		// Failure Response
		List<EmployeePOJO> employees = service.searchAllEmployees();
		map.addAttribute("empList", employees);
		map.addAttribute("msg", "Employee data does not exist..!!");
		return "Remove";
	}

	// Update Page Controller
	@GetMapping("/update")
	public String updatePage(ModelMap map) {
		List<EmployeePOJO> employees = service.searchAllEmployees();
		map.addAttribute("empList", employees);
		return "Update";
	}

	// Update Form Controller
	@PostMapping("/update")
	public String updateForm(@RequestParam int id, ModelMap map) {
		EmployeePOJO employee = service.search(id);
		if (employee != null) {
			// Success response
			map.addAttribute("emp", employee);
			return "Update";
		}
		// Failure response
		map.addAttribute("msg", "Employee record not found..!!");
		List<EmployeePOJO> employees = service.searchAllEmployees();
		map.addAttribute("empList", employees);
		return "Update";
	}

	// Update Data Controller
	@PostMapping("/updateData")
	public String update(@RequestParam int id, @RequestParam String name, @RequestParam String email,
			@RequestParam long contact, @RequestParam String designation, @RequestParam double salary, ModelMap map) {
		EmployeePOJO employee = service.updateEmployee(id, name, email, contact, designation, salary);
		if (employee != null) {
			// Success response
			map.addAttribute("msg", "Employee record updated successfully..!!");
			List<EmployeePOJO> employees = service.searchAllEmployees();
			map.addAttribute("empList", employees);
			return "Update";
		}
		// Failure response
		map.addAttribute("msg", "Employee record not updated..!!");
		List<EmployeePOJO> employees = service.searchAllEmployees();
		map.addAttribute("empList", employees);
		return "Update";
	}

	// Login Controller
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password, ModelMap map) {
		AdminPOJO admin = adminService.login(username, password);
		if (admin != null) {
			// Success response
			return "Home";
		}
		// Failure response
		map.addAttribute("msg", "Invalid username or password");
		return "Login";
	}

	// Logout Controller
	@GetMapping("/logout")
	public String logout(ModelMap map) {
		map.addAttribute("msg", "Logged out successfully");
		return "Login";
	}

	// Create Admin Page Controller
	@GetMapping("/createAdmin")
	public String adminPage() {
		return "AddAdmin";
	}

	// Create Admin Controller
	@PostMapping("/createAdmin")
	public String admin(@RequestParam String username, @RequestParam String password, ModelMap map) {
		AdminPOJO admin = adminService.addAdmin(username, password);
		if (admin != null) {
			// Success response
			map.addAttribute("msg", "Account created successfully..!!");
			return "Login";
		}
		// Failure response
		map.addAttribute("msg", "Account not created..!!");
		return "Login";
	}

}