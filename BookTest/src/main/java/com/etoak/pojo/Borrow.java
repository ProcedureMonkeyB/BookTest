package com.etoak.pojo;

import java.util.Date;

public class Borrow {
	private Integer borrowId;
	private String borrowCode;
	private String bookCode;
	private String borrowName;
	private String borrowPhone;
	private Date borrowTime;
	private Date returnTime;
	public Integer getBorrowId() {
		return borrowId;
	}
	public void setBorrowId(Integer borrowId) {
		this.borrowId = borrowId;
	}
	public String getBorrowCode() {
		return borrowCode;
	}
	public void setBorrowCode(String borrowCode) {
		this.borrowCode = borrowCode;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBorrowName() {
		return borrowName;
	}
	public void setBorrowName(String borrowName) {
		this.borrowName = borrowName;
	}
	public String getBorrowPhone() {
		return borrowPhone;
	}
	public void setBorrowPhone(String borrowPhone) {
		this.borrowPhone = borrowPhone;
	}
	public Date getBorrowTime() {
		return borrowTime;
	}
	public void setBorrowTime(Date borrowTime) {
		this.borrowTime = borrowTime;
	}
	public Date getReturnTime() {
		return returnTime;
	}
	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}
	@Override
	public String toString() {
		return "Borrow [borrowId=" + borrowId + ", borrowCode=" + borrowCode + ", bookCode=" + bookCode
				+ ", borrowName=" + borrowName + ", borrowPhone=" + borrowPhone + ", borrowTime=" + borrowTime
				+ ", returnTime=" + returnTime + "]";
	}
	
}
