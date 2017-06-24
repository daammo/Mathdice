package PruebasJUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import Metodos.TiradaDados;

public class Prueba {
	TiradaDados T=new TiradaDados();
	
	
	//Test para saber si el numero que genera mi metodo esta dentro del rango correspondiente
	@Test
	public void pruebaDadoTres() {
		assertTrue(T.GenerarAleatorioDadoTres()>=1);
		assertTrue(T.GenerarAleatorioDadoTres()<=3);
	}

}
