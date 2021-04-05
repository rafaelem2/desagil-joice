package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora{
	
	public CalculadoraCFC() {
		super("CFC");
	}

	@Override
	public double calcula(double peso, double raio) {
		double avogadro = 6.023 * Math.pow(10, 23);
		double raioCm = raio * Math.pow(10, -7);
		double ma = 4*peso/avogadro;
		double volume = Math.pow(4 * raioCm/Math.sqrt(2), 3);
		double densidade = ma/volume;
		
		return densidade;
	}
}