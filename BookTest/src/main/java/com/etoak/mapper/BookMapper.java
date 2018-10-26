package com.etoak.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.etoak.pojo.Book;

@Mapper
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);
    
	List<Book> queryAllBookInfo(Book book);
}