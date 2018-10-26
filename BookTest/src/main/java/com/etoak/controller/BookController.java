package com.etoak.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etoak.pojo.Book;
import com.etoak.service.BookService;
import com.etoak.util.ResponseData;
import com.etoak.util.ResponseEnum;
import com.etoak.vo.PageVo;
import com.github.pagehelper.Page;

@RestController
@RequestMapping("/book")
public class BookController {
	
	private static final Logger log = Logger.getLogger(BookController.class);
	
	@Autowired
	private BookService bookService;
	/**
	 * 查询全部书籍信息
	 * @return
	 */
	@RequestMapping("/getAllBookInfo")
	public ResponseData getAllBookInfo(PageVo pageVo,Book book) {
		log.info("enter getAllBookInfo Method ! param:{}" + book.toString());
		Page<Book> page = bookService.getAllBookInfo(pageVo,book);
		ResponseData responseData = new ResponseData();
		if(page == null) {
			responseData.setCode(ResponseEnum.FAILED.getCode());
			responseData.setMessage(ResponseEnum.FAILED.getMessage());
			responseData.setData(null);
			return responseData;
		}
		responseData.setCode(ResponseEnum.SUCCESS.getCode());
		responseData.setMessage(ResponseEnum.SUCCESS.getMessage());
		responseData.setData(page);
		return responseData;
	}
	
	/**
	 * 增加书籍信息
	 * @return
	 */
	public ResponseData addBookInfo() {
		return null;
	}
	
	/**
	 * 修改书籍信息
	 * @return
	 */
	public ResponseData deleteBookInfo() {
		return null;
	}
	
	/**
	 * 修改书籍信息
	 * @return
	 */
	public ResponseData updateBookInfo() {
		return null;
	}
}
