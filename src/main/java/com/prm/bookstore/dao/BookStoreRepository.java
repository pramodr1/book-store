package com.prm.bookstore.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import com.prm.bookstore.vo.BookStore;

public interface BookStoreRepository extends CrudRepository<BookStore, Integer> {
	
	
	public BookStore findBookStoreById(Integer Id);
	public BookStore findBookStoreByStoreName(String name);

}
