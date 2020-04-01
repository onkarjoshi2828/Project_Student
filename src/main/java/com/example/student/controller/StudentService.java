package com.example.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student.model.Student;

@Service
public class StudentService {

	List<Student> studList= new ArrayList<Student>();
	
	public Student save(Student stud)
	{
		System.out.println(stud.getName());
		System.out.println(stud.getCity());
		System.out.println(stud.getRoll());
		
		studList.add(stud);
		return stud;
	}
	
	public List<Student> findByCity(String city)
	{
		List<Student> list=new ArrayList<>();
		for(Student st:studList)
		{
			if(st.getCity().equals(city))
				list.add(st);
		}
		return list;
	}
}
