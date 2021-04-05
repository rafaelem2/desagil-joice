package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	
	public CalculadoraCCC() {
		super("CCC");
	}

	@Override
	public double calcula(double peso, double raio) {
		
		double avogadro = 6.023 * Math.pow(10, 23);
		double raioCm = raio * Math.pow(10, -7);
		double ma = (4 * peso)/avogadro;
		double volume =2 * Math.pow((4.0 * raioCm / Math.sqrt(3)), 3);
		double densidade = ma/volume;
		
		return (densidade);
		
	}
}