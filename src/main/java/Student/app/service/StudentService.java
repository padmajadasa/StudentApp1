package Student.app.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student.app.model.School;
import Student.app.model.Student;
import Student.app.repo.StudentRespoaitary;

@Service
public class StudentService {
//Map < String,Student> map = new HashMap<String,Student>();
	@Autowired
	StudentRespoaitary studentRepo;

	public void save(Student s) {
		studentRepo.save(s);
	}

	public List<Student> allStd() {
		return studentRepo.findAll();
	}

	public List<Student> getStudent(String name) {
	 
		return studentRepo.findByName(name);
	}

	public List<Student> getStudent(String name, String phone) {
		return studentRepo.findByNameAndPhoneNumner(name,phone);
	}
	
	public void addSchool() {
		
		School s= new School();
		s.setName("NewYark");
		s.setId("1234");
		s.setLocation("abcd");
		
		
		
	}
}

