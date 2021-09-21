package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class testesCalculadora {
	@Test
	public void testarSoma() {
		Calculadora calc = new Calculadora();
		double esperado = 5;
		double resultado = calc.somar(2, 3);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarSubtracao() {
		Calculadora calc = new Calculadora();
		double esperado = 5;
		double resultado = calc.subtrair(10, 5);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarMultiplicacao() {
		Calculadora calc = new Calculadora();
		double esperado = 6;
		double resultado = calc.multiplicar(2, 3);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarDivisao() {
		Calculadora calc = new Calculadora();
		double esperado = 2;
		double resultado = calc.dividir(10, 5);

		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testarDivisaopor0() {
		Calculadora calc = new Calculadora();
		double esperado = 3;
		double resultado = calc.dividir(10, 0);

		assertEquals(esperado, resultado);
	
	}
	
	@Test
	public void testarDivisaode0por10() {
		Calculadora calc = new Calculadora();
		double esperado = 0;
		double resultado = calc.dividir(0, 10);

		assertEquals(esperado, resultado);
	
	}
	
	@Test
	public void testarDivisaode0por0() {
		Calculadora calc = new Calculadora();
		double esperado = 0;
		double resultado = calc.dividir(0, 0);

		assertEquals(esperado, resultado);
	
	}
}
