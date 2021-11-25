package com.example.demo.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "conductor")
public class Conductor {

	@Id
	Long id;
	

	
	@ManyToMany 
	Set<Circuito> circuito;
	
}
