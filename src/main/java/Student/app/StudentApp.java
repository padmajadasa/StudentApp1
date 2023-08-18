package Student.app;

import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Student.app.model.Student;
import Student.app.service.StudentService;
@SpringBootApplication
public class StudentApp {

	public static void main(String[] args) {
		SpringApplication.run(StudentApp.class, args);
	}

	
	

}

