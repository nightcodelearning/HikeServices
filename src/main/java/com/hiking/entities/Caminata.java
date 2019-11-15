package com.hiking.entities;

import java.util.UUID;

public class Caminata {
	
	private String name;
	private String descripcion;
	private UUID guidCaminata;
	private String distancia;
	
	public Caminata(String name, String descripcion, UUID guidCaminata, String distancia) {
		super();
		this.name = name;
		this.descripcion = descripcion;
		this.guidCaminata = guidCaminata;
		this.distancia = distancia;
	}
	
	

}
