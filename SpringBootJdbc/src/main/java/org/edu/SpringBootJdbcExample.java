package org.edu;

import org.edu.model.Students;
import org.edu.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@EnableScheduling
public class SpringBootJdbcExample implements CommandLineRunner {

	@Autowired
	StudentService studentService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcExample.class, args);
	}
	
	@Override
	public void run(String ...args) {
		for(Students obj: studentService.findAll()) {
			System.out.println(obj.getStudentId() +" "+ obj.getStudentName()+" "+ obj.getAge());
		}
//		st.setStudentId(104);
//		st.setStudentName("Walter white");
//		st.setAge(99);
//		System.out.println(studentService.save(st));
		Students st = new Students();
		st.setAge(55);
		st.setStudentId(101);
//		System.out.println(studentService.findById(100).getStudentName());
	}

}


