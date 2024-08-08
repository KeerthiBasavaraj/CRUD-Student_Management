package in.Keerthi.Service;

import java.util.List;

import in.Keerthi.entity.Student;

public interface StudentService {
	public Student saveStudent(Student student);

	public List<Student> getAllStudents();

	public String deleteStudent(Integer id);

	public Student editStudent(Student student, Integer id);
}
