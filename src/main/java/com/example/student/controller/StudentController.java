package com.example.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;

@RestController
@ComponentScan (basePackages= {"com.example.student"})
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public Student saveStudent(@RequestBody Student student)
	{
		return studentService.save(student);
	}
	
	@RequestMapping(value="/findByCity/{city}", method=RequestMethod.GET)
	public List<Student> findByCity(@PathVariable ("city") String city)
	{
		return studentService.findByCity(city);
	}
}	

