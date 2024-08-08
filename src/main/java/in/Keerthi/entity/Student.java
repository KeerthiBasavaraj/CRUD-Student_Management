package in.Keerthi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="student_table")
public class Student {
	@Id
	private Integer id;
	private String name;
	private long rollno;
	private double perc;
	private String branch;
}
