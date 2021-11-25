package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "matricula")
public class Matricula implements Serializable{

	
	@Id
	@GeneratedValue
	private long id;
	
	@Column
	private String matricula;
	
	@OneToOne(mappedBy = "matricula")
	private Coche coche;
}
