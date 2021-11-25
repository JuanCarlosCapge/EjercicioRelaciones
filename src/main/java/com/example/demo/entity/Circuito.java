package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "circuito")
public class Circuito {

	
	@Id
	Long id;
	
	
	@ManyToMany
	Set<Conductor> conductor;
}
