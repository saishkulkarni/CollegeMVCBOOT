package org.jsp.jesa5.service;

import org.jsp.jesa5.dao.CourseDao;
import org.jsp.jesa5.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CourseService {
	
	@Autowired
	Course course;
	
	@Autowired
	CourseDao courseDao;

	public ModelAndView load() {
		ModelAndView view=new ModelAndView("AddCourse");
		view.addObject("course",course);
		return view;
	}

	public ModelAndView add(Course course) {
		ModelAndView view=new ModelAndView("Home");
		
		Course course2=courseDao.fetch(course.getName());
		if(course2==null)
		{
		courseDao.add(course);
		view.addObject("msg","Course Added Successfully");
		}else {
			view.addObject("msg",course.getName()+" Course Already Exists");
		}
		return view;
	}

}
