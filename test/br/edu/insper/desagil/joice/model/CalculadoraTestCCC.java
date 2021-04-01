package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTestCCC {
	
	private static double Tolerancia = 0.05;
	private Calculadora calculaCCC;
	
	@BeforeEach
	public void setUp() {
		calculaCCC = new CalculadoraCCC();
	}
	
	@Test
	void test_niobio() {
		assertEquals(8.57, calculaCCC.calcula(92.91, 0.143), Tolerancia);
	}
	
	@Test
	void test_tungstenio() {
		assertEquals(19.28, calculaCCC.calcula(183.84, 0.137), Tolerancia);
	}
	
	@Test
	void test_litio() {
		assertEquals(0.53, calculaCCC.calcula(6.94, 0.152), Tolerancia);
	}

}
