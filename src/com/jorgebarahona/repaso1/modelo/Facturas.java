package com.jorgebarahona.repaso1.modelo;

import com.jorgebarahona.repaso1.vista.Ejecutador;

public class Facturas {
	
	private int id;
	private String nombre;
	private float importe;
	
	
	public Facturas(int _id, String _nombre, float _importe) throws Exception{
		super();
		@SuppressWarnings("unused")
		Ejecutador e = new Ejecutador();
		if(nombre.trim().isEmpty()==false) {
			throw new Exception ("El nombre no puede estar vacio");
		}
		this.id = _id;
		this.nombre = _nombre;
		this.importe = _importe;
		
	}
	/*Prueba*/

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getImporte() {
		return importe;
	}


	public void setImporte(float importe) {
		this.importe = importe;
	}


	public void mostrar() {
		System.out.println("ID del Producto:"+id+", Nombre Producto:"+nombre+ ", Importe:"+importe);
	}

}
