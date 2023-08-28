package Student.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import Student.app.model.Student;

public interface StudentRespoaitary  extends JpaRepository<Student, String>{

	List<Student> findByName(String name);

	List<Student> findByPhoneNumner(String phone);

	List<Student> findByNameAndPhoneNumner(String name, String phone);

}
