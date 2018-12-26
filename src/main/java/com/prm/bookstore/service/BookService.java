package com.prm.bookstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.prm.bookstore.dao.BookStoreRepository;
import com.prm.bookstore.vo.BookStore;

@Service

@Repository

@Configuration
public class BookService {
	

	
	//@PersistenceContext
	// private EntityManager entityManager;

	

/*	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(driverClassName);
		ds.setUsername(username);
		ds.setPassword(password);
		ds.setUrl(url);
		
		return ds;
		
	}*/
	
	@Autowired BookStoreRepository bookStoreRepository;
	
	public BookStore getBookStoreByStoreName(String name) {
		
		return bookStoreRepository.findBookStoreByStoreName(name);
		
	}

}
