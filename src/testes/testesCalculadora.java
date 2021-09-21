package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class testesCalculadora {
	@Test
	public void testarSoma() {
		Calculadora calc = new Calculadora();
		float esperado = 5;
		float resultado = calc.somar(2, 3);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarSubtracao() {
		Calculadora calc = new Calculadora();
		float esperado = 5;
		float resultado = calc.subtrair(10, 5);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarMultiplicacao() {
		Calculadora calc = new Calculadora();
		float esperado = 6;
		float resultado = calc.multiplicar(2, 3);

		assertEquals(esperado, resultado);
	}

	@Test
	public void testarDivisao() {
		Calculadora calc = new Calculadora();
		float esperado = 3;
		float resultado = calc.dividir(10, 5);

		assertEquals(esperado, resultado);
	}

}
