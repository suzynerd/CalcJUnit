package br.com.ifrn.calculadoraTest;

import org.junit.Assert;
import org.junit.Test;

import br.com.ifrn.calculadora.Calculadora;

public class TestCalculadora {

	@Test
	public void testSomaDoisNumeros() {
		Calculadora calc = new Calculadora();
		
		int resultado = calc.SomaDoisNumeros(3,5);
		
		//verifica se o resultado da soma 3+5 é igual a 8
		Assert.assertEquals(8, resultado);
	}

}
