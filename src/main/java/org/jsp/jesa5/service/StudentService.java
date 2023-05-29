package org.jsp.jesa5.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import org.jsp.jesa5.dto.Student;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class StudentService {

	public ModelAndView signup(Student student, String date) {
		Date dob=Date.valueOf(date);
		student.setDob(dob);
		int age=Period.between(dob.toLocalDate(), LocalDate.now()).getYears();
		student.setAge(age);
		
		
		
				
	}

}
