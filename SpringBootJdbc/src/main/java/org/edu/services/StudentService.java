package org.edu.services;

import java.util.List;
import java.util.Optional;

import org.edu.model.Students;

public interface StudentService {
	public List<Students> findAll();
	int save(Students st);
	int delete(int id);
	int update(Students st);
	Optional<Students> findById(int id);

}
