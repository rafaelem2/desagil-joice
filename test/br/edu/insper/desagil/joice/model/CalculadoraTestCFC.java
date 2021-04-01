package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTestCFC {
	
	private static double Tolerancia = 0.05;
	private Calculadora calculaCFC;
	
	@BeforeEach
	public void setUp() {
		calculaCFC = new CalculadoraCFC();
	}
	
	@Test
	void test_cobre() {
		assertEquals(8.89, calculaCFC.calcula(63.55, 0.128), Tolerancia);
	}
	
	@Test
	void test_ouro() {
		assertEquals(19.36, calculaCFC.calcula(196.97, 0.144), Tolerancia);
	}
	
	@Test
	void test_prata() {
		assertEquals(10.60, calculaCFC.calcula(107.87, 0.144), Tolerancia);
	}
	
}


