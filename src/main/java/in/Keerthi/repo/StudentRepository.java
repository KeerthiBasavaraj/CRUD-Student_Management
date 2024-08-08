package in.Keerthi.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.Keerthi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
