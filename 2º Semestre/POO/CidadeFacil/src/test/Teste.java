package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import prova.TransporteMetro;
import prova.TransporteOnibus;
import prova.TransporteTaxi;

public class Teste {

	@Test
	public void teste1() {

		TransporteMetro t1 = new TransporteMetro("Metrô", "Transporte subterrâneo rápido");

		assertEquals(20, t1.calcularTarifa(10));

	}
	
	@Test
	public void teste2() {

		TransporteOnibus t2 = new TransporteOnibus("Ônibus", "Transporte coletivo convencional");

		assertEquals(12, t2.calcularTarifa(10));

	}
	
	@Test
	public void teste3() {

		TransporteTaxi t3 = new TransporteTaxi("Taxi", "Transporte individual sob demanda");

		assertEquals(35, t3.calcularTarifa(10));

	}

}
