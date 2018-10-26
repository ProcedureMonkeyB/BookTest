package com.etoak.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etoak.controller.BookController;
import com.etoak.mapper.BookMapper;
import com.etoak.pojo.Book;
import com.etoak.service.BookService;
import com.etoak.vo.PageVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class BookServiceImpl implements BookService {
	
	private static final Logger log = Logger.getLogger(BookService.class);
	
	@Autowired
	private BookMapper bookMapper;
	
	@Override
	public Page<Book> getAllBookInfo(PageVo pageVo, Book book) {
		log.info("enter BookServiceImpl  getAllBookInfo Method !");
		Page<Book> page = PageHelper.startPage(pageVo.getPageNumber(), pageVo.getPageSize()).doSelectPage(() ->bookMapper.queryAllBookInfo(book));
		return page;
	}

}
