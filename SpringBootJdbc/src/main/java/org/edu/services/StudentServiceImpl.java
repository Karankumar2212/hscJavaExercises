package org.edu.services;

import java.util.List;
import java.util.Optional;
import org.edu.model.Students;
import org.edu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepository srepository; 
	public List<Students> findAll() {
		return srepository.findAll();
	}
	
	public int save(Students st) {
		return srepository.save(st);
	}

	
	public int delete(int id) {
		return srepository.delete(id);
	}

	
	public int update(Students st) {
		return srepository.update(st);
	}

	
	public Optional<Students> findById(int id){
//		return Optional.of(srepository.findById(id));
		return null;
	}
}


