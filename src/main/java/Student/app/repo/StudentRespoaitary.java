package Student.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import Student.app.model.Student;

public interface StudentRespoaitary  extends JpaRepository<Student, String>{

}
