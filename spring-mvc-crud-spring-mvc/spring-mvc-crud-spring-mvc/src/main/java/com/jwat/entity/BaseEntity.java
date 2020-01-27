package com.jwat.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "createddate")
	@CreatedDate
	private Date createddate;
	
	@Column(name = "modifieddate")
	@LastModifiedDate
	private Date modifieddate;
	
	@Column(name = "createdby")
	@CreatedBy
	private String createdby;
	
	@Column(name = "modifiedby")
	@LastModifiedBy
	private String modifiedby;

	public Long getId() {
		return id;
	}

	public Date getCreatedDate() {
		return createddate;
	}
	
	public Date getModifiedDate() {
		return  modifieddate;
	}

	public String getCreatedBy() {
		return createdby;
	}

	public String getModifiedBy() {
		return modifiedby;
	}
}
