package org.jsp.jesa5.service;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import org.jsp.jesa5.dao.StudentDao;
import org.jsp.jesa5.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;

	public ModelAndView signup(Student student, String date) {
		ModelAndView view = new ModelAndView();
		if(studentDao.fetch(student.getEmail())==null && studentDao.fetch(student.getMobile())==null )
		{	
		Date dob = Date.valueOf(date);
		student.setDob(dob);
		int age = Period.between(dob.toLocalDate(), LocalDate.now()).getYears();
		student.setAge(age);

		studentDao.save(student);
		view.setViewName("Home");
		view.addObject("success", "Student Account created Success");
		}
		else {
			view.setViewName("StudentSignup");
			view.addObject("fail", "Email or Phone already Exists");
		}
		return view;

	}

}
