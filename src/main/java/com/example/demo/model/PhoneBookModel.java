package com.example.demo.model;

public class PhoneBookModel {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column phone_book.id
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	private String id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column phone_book.name
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column phone_book.phone_no
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	private String phoneNo;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column phone_book.id
	 * @return  the value of phone_book.id
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column phone_book.id
	 * @param id  the value for phone_book.id
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column phone_book.name
	 * @return  the value of phone_book.name
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column phone_book.name
	 * @param name  the value for phone_book.name
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column phone_book.phone_no
	 * @return  the value of phone_book.phone_no
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column phone_book.phone_no
	 * @param phoneNo  the value for phone_book.phone_no
	 * @mbg.generated  Fri Sep 18 19:26:32 JST 2020
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo == null ? null : phoneNo.trim();
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソ�?ド�?�スタ�?
		return super.toString();
	}
}