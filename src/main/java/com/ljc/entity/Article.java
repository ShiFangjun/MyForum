package com.ljc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LJC 
 * 帖子列表实体
 */

public class Article implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer aid; // 帖子id
	private String title;
	private String content;
	private Date date;
	private Integer uid; // 发帖用户id
	private String author; // 发帖人昵称
	private String lable; // 帖子标签

	public Integer getAid() {
		return aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

}