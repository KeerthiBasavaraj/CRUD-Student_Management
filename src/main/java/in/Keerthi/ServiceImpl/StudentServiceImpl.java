package in.Keerthi.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.Keerthi.entity.Student;
import in.Keerthi.repo.StudentRepository;
import in.Keerthi.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepository repo;
	
	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return repo.findAll();
	}
	
	@Override
	public Student editStudent(Student s, Integer id) {
		Student oldstudent = repo.findById(id).get();

		oldstudent.setName(s.getName());
		oldstudent.setRollno(s.getRollno());
		oldstudent.setPerc(s.getPerc());
		oldstudent.setBranch(s.getBranch());

		return repo.save(oldstudent);
	}
	
	@Override
	public String deleteStudent(Integer id) {
		Student student=repo.findById(id).get();
		
		if(student!=null) {
			repo.delete(student);
			return "Student Deleted Sucessfully";
		}
		return "Delete Unsucessfull";
	}

}
