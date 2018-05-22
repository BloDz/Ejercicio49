package com.jorgebarahona.repaso1.modelo;

import java.util.Comparator;

import com.jorgebarahona.repaso1.vista.Ejecutador;

public class Facturas implements Comparator<Facturas>{
	
	private int id;
	private String nombre;
	private float importe;
	
	
	public Facturas(int _id, String _nombre, float _importe) throws Exception{
		this.id = _id;
		this.importe = _importe;
		if(nombre.trim().isEmpty()==false) {
			throw new Exception ("El nombre no puede estar vacio");
		}
		
		this.nombre = _nombre;
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

	@Override
	public int compare(Facturas o1, Facturas o2) {
		if(o1.getId()>o2.getId()) {
			return 1;
		} else if(o1.getId()<o2.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
