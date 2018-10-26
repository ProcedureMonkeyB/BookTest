package com.etoak.pojo;


public class Book {
	private Integer bookId;
	private String bookCode;
	private String bookName;
	private String bookPublisher;
	private String typeCode;
	private Integer bookQuantity;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public Integer getBookQuantity() {
		return bookQuantity;
	}
	public void setBookQuantity(Integer bookQuantity) {
		this.bookQuantity = bookQuantity;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookCode=" + bookCode + ", bookName=" + bookName + ", bookPublisher="
				+ bookPublisher + ", typeCode=" + typeCode + ", bookQuantity=" + bookQuantity + "]";
	}	
	
}
