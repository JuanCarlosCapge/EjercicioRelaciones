package com.example.demo.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "equipo")
public class Equipo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String titular;
	private String suplente;
	
	
	
	@OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY , cascade = CascadeType.ALL)
	private Set<Futbolista> equipo;

}
