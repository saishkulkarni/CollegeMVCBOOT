package org.jsp.jesa5.controller;

import org.jsp.jesa5.dto.Student;
import org.jsp.jesa5.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("signup")
	public ModelAndView signup(@ModelAttribute Student student,@RequestParam String date)
	{
		return studentService.signup(student,date);
	}
}
