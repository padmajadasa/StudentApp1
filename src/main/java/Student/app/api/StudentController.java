package Student.app.api;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Student.app.model.Student;
import Student.app.service.StudentService;

@RestController
public class StudentController {
	@Autowired
    StudentService ss;

	@GetMapping("/enterData")
	public List<Student> enterData() {
	      Student s = new Student();
	      
	     
	      s.setId(UUID.randomUUID().toString());
	      s.setAddress("ujhbjd");
	      s.setName("jnj");
	      s.setPhoneNumner("387484756");
	      s.setSection("4");
	      
	      ss.save(s);
	      
	      List<Student> student = ss.allStd();
	      student.stream().forEach(a-> System.out.println(a.getName()));
	      return student;
	      }
	

	@GetMapping("/getStudent/{name}")
	public List<Student> getStudent(@PathVariable String name) {
	
		return ss.getStudent(name);
	}
	
	@GetMapping("/getStudent/{name}/{phone}")
	public List<Student> getStudent(@PathVariable String name,@PathVariable String phone) {
	
		return ss.getStudent(name,phone);
	}
	
	@PostMapping
	public List<Student> addStudent(@RequestBody Student st) {
		st.setId(UUID.randomUUID().toString());
		ss.save(st);
		return ss.allStd();
	}
}
