package org.jsp.jesa5.repository;

import org.jsp.jesa5.dto.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer>
{

}
