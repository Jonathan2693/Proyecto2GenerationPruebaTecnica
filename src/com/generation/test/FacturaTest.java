package com.generation.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.generation.clases.Factura;
/**
 * 
 * @author Jonathan Quino
 * @Description Clase TIPO TEST para probar los metodos de la clase factura
 *
 */
class FacturaTest {

	@Test
	@DisplayName(value = "Test para la clase factura")
	void testFactura() {
		Factura facturaTest = new Factura("551115", "Factura de prueba", 10, 135.2);
		
		//Probar que el precio del artículo sea 135.2
		assertEquals(facturaTest.getPrecioArticulo(), 135.2);
		
		//Probar que el total de la factura es 1352.0
		assertEquals(facturaTest.getTotalFactura(), 1352.0);
		
		//Se crea una nueva instancia de factura donde el precio de articulo sea 0.0
		Factura facturaTest2 = new Factura("551110", "Factura de prueba2", 1, -253.1);
		assertEquals(facturaTest2.getPrecioArticulo(),0.0);
		
		//forzando un valor negativo de factura, se verifica que el total devuelto sea 0
		facturaTest2.setPrecioArticulo(-10.0);
		assertEquals(facturaTest2.getTotalFactura(), 0);
	}

}
