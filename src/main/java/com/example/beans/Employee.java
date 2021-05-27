package com.example.beans;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Component;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee10")

public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "department")
	private String department;
	@Column(name = "salary")
	private int salary;
//	@OneToOne
//	private Project projects;
//	@OneToMany
//	private List<Project> project2;
//	@ManyToOne
//	private Project project7;
	
	@ManyToMany
	private List<Project> project100;
}
