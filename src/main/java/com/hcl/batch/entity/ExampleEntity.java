package com.hcl.batch.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExampleEntity {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String desciption;

	public ExampleEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public ExampleEntity(String desciption) {
		super();
		this.desciption = desciption;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	@Override
	public String toString() {
		return "ExampleRepository [id=" + id + ", desciption=" + desciption + "]";
	}
	
	
	
	
	
	
}
