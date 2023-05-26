package org.jsp.jesa5.service;

import java.util.List;

import org.jsp.jesa5.dao.CourseDao;
import org.jsp.jesa5.dto.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class CourseService {

	@Autowired
	CourseDao courseDao;

	public ModelAndView add(Course course) {
		ModelAndView view = new ModelAndView("Home");

		Course course2 = courseDao.fetch(course.getName());
		if (course2 == null) {
			courseDao.add(course);
			view.addObject("msg", "Course Added Successfully");
		} else {
			view.addObject("msg", course.getName() + " Course Already Exists");
		}
		return view;
	}

	public ModelAndView checkCourse() {
		ModelAndView view = new ModelAndView();

		List<Course> list = courseDao.fetch();
		if (list.isEmpty()) {
			view.setViewName("Home");
			view.addObject("msg", "First Add Course");
		} else {
			view.setViewName("AddStream");
			view.addObject("list", list);
		}
		return view;
	}

}
