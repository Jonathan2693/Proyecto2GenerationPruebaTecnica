package com.generation.clases;
/**
 * 
 * @author Jonathan Quino
 * @Description Clase Factura de proyecto 2
 *
 */
public class Factura {

	private String numero;
	private String descripcion;
	private int cantidadComprada;
	private double precioArticulo;
	
	/**
	 * @Description Constructor con parámetros obligatorios
	 * @param numero
	 * @param descripcion
	 * @param cantidadComprada
	 * @param precioArticulo
	 */
	public Factura(String numero, String descripcion, int cantidadComprada, double precioArticulo) {
		this.numero = numero;
		this.descripcion = descripcion;
		this.cantidadComprada = cantidadComprada;
		this.precioArticulo = (precioArticulo<0) ? 0.0 : precioArticulo;  //Si el precio no es positivo, se coloca el precio en 0.0
	}
	
	/**
	 * @Description Metodo para calcular el total de la factura
	 * 
	 * @return total de la factura
	 */
	public double getTotalFactura() {
		double total = this.cantidadComprada * this.precioArticulo;
		return (total<0) ? 0 : total;		//Si el total de factura no es positivo, se regresara un 0
	}

	//Getters y Setters
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidadComprada() {
		return cantidadComprada;
	}

	public void setCantidadComprada(int cantidadCompradaArticulo) {
		this.cantidadComprada = cantidadCompradaArticulo;
	}

	public double getPrecioArticulo() {
		return precioArticulo;
	}

	public void setPrecioArticulo(double precioArticulo) {
		this.precioArticulo = precioArticulo;
	}
	
	
	
}
