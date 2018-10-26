package com.etoak.mapper;

import org.springframework.stereotype.Repository;

import com.etoak.pojo.Borrow;

@Repository
public interface BorrowMapper {
    int deleteByPrimaryKey(Integer borrowId);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    Borrow selectByPrimaryKey(Integer borrowId);

    int updateByPrimaryKeySelective(Borrow record);

    int updateByPrimaryKey(Borrow record);
}