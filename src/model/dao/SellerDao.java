package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.seller;

public interface SellerDao {
	
	void insert(seller obj);
	void update(seller obj);
	void deleteById(Integer id);
	seller findById(Integer id);
	List<seller> findAll();
	List<seller> findByDepartment(Department department);
}

