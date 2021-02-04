package loogbook.featuresjava.oldFeatures;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loogbook.entities.Usuario;

public class Comparators {
	
	
	private List<Usuario> usuarios = new ArrayList<>();
	
	@BeforeEach
	public void setup() {
		Usuario user1 = new Usuario("Paulo", 150);
		Usuario user2 = new Usuario("Ana", 20);
		Usuario user3 = new Usuario("Ricardo", 30);
		
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
	}
	
	@Test
	public void deveOrdernarComComparator() {
		
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario o1, Usuario o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		};
		
		Collections.sort(usuarios, comparator);
		assertEquals(usuarios.get(0).getNome(), "Ana");
		
	}
	
	@Test
	public void deveOrdernarComComparatorComLambda() {
		
		Comparator<Usuario> comparator = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
		
		Collections.sort(usuarios, comparator);
		assertEquals(usuarios.get(0).getNome(), "Ana");
		
	}
	
	@Test
	public void deveOrdernarComComparatorComLambdaUsandoSort() {
		
		usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));
		assertEquals(usuarios.get(0).getNome(), "Ana");
		
	}
	
	@Test
	public void ordenaPorPontos() {
		
		ToIntFunction<Usuario> extraiPontos = u -> u.getPontos();
		Comparator<Usuario> comparator = Comparator.comparingInt(extraiPontos);
		
		usuarios.sort(comparator);
		
		usuarios.sort(Comparator.comparingInt(u -> u.getPontos()));
		
	}
	

	
	
	
	
	
	
	
	
	

}
