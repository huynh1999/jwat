package com.jwat.model;

public class NewModel extends AbstractModel<NewModel> {
	
	private String title;
	private String thumbnail;
	private String shortdescription;
	private String content;
	private Long categoryid;
	private String categorycode;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getShortDescription() {
		return shortdescription;
	}
	public void setShortDescription(String shortdescription) {
		this.shortdescription = shortdescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Long getCategoryId() {
		return categoryid;
	}
	public void setCategoryId(Long categoryid) {
		this.categoryid = categoryid;
	}

	public String getCategoryCode() {
		return categorycode;
	}

	public void setCategoryCode(String categorycode) {
		this.categorycode = categorycode;
	}
}
