package loogbook.featuresjava.oldFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loogbook.entities.Usuario;

public class Exercicios {
	
private List<Usuario> usuarios = new ArrayList<>();
	
	@BeforeEach
	public void setup() {
		Usuario user0 = new Usuario("Wesly", 20);
		Usuario user1 = new Usuario("Paulo", 20);
		Usuario user2 = new Usuario("Adriana", 20);
		Usuario user3 = new Usuario("Ricardo", 30);
		Usuario user4 = new Usuario();
		user4.setNome("Bruno");
		
		usuarios.add(user0);
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		usuarios.add(user4);
	}
	
//	@Test
	public void testaMethodReference() {
		usuarios.sort(Comparator.comparing(Usuario::getNome));
		usuarios.forEach(Usuario::print);
		
	}
	@Test
	public void comparaPorPontoEEmpate() {
		usuarios.sort(Comparator.comparingInt(Usuario::getPontos).thenComparing(Usuario::getNome));
		
		
		usuarios.forEach(Usuario::print);
		
	}
	
	

}
