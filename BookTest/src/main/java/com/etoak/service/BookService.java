package com.etoak.service;

import org.springframework.stereotype.Service;

import com.etoak.pojo.Book;
import com.etoak.vo.PageVo;
import com.github.pagehelper.Page;

@Service
public interface BookService {
	/**
	 * 查询全部图书信息
	 * @param pageVo
	 * @param book
	 * @return
	 */
	Page<Book> getAllBookInfo(PageVo pageVo, Book book);

}
