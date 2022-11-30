package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ====");
		seller Seller =  sellerDao.findById(3);
		
		System.out.println(Seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<seller> list = sellerDao.findByDepartment(department);
		for (seller obj : list) {
			System.out.println(obj);
		}

	}

}
