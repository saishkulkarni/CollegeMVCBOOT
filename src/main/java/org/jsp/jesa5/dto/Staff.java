package org.jsp.jesa5.dto;

import java.sql.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Data;

@Entity
@Data
@Component
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private long mobile;
	private int age;
	private Date dob;
	private boolean status;
	private String gender;
	private String password;
	private String designation;
	
	@Lob
	@Column(columnDefinition = "MEDIUMBLOB")
	byte[] picture;
}
