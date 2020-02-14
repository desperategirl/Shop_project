package com.biz.rbooks.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.biz.rbooks.domain.BookVO;
import com.biz.rbooks.persistence.BookDao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookDao bookDao;
	
	
	// Create
	public int insert(BookVO bookVO) {
		return bookDao.insert(bookVO);
	}
	
	// Read
	public List<BookVO> selectAll(){
		return bookDao.selectAll();
	}
	
	// Update
	public int update(BookVO bookVO) {
		return bookDao.update(bookVO);
	}
	
	// Delete
	public int delete(String b_code) {
		return bookDao.delete(b_code);
	}

	public BookVO findById(String b_code) {
		
		return bookDao.findById(b_code);
	}
	
}
