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
	}

	@Test
	public void testarExponenciacao() {
		Calculadora calc = new Calculadora();
		double esperado = 24;
		double resultado = calc.exponenciacao(5);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarRaizQuadrada() {
		Calculadora calc = new Calculadora();
		double esperado = 4;
		double resultado = calc.raizQuadrada(25);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarporcentagem() {
		Calculadora calc = new Calculadora();
		double esperado = 4;
		double resultado = calc.porcentagem(0.45);

		assertEquals(esperado, resultado);
	}

}
