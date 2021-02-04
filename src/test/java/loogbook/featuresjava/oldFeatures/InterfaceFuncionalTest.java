package loogbook.featuresjava.oldFeatures;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import loogbook.utils.Validator;

public class InterfaceFuncionalTest {
	
	/*
	 * Toda interface que possui um método abstrato é uma interface funcional
	 * para que a interface seja realmente funcional e garanta que ninguem crie outro método
	 * anote com @FunctionalInterface
	 * Interfaces funcionais são o coração do recurso de Lambda.
	 */
	
	
	
	Validator<String> validaCep = valor -> {return valor.matches("[0-9]{5}-[0-9]{3}");};
	
	@Test
	public void testaCep() {
		
		assertThat(validaCep.valida("04101-300")).isTrue();
	
		
	}

}
