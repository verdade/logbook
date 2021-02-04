package loogbook.featuresjava.oldFeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loogbook.entities.Usuario;

public class ConsumerOldFeaturesTest {
	
	
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
	public void deveTestarOldConsumer() {
		
		MostradorUsuarioConsumer mostrador = new MostradorUsuarioConsumer();
		
		usuarios.forEach(mostrador);
		
		
	}
	
	@Test
	public void deveTestarBestPraticeConsumer() {
		
		Consumer<Usuario> mostrador = new Consumer<Usuario>() {

			@Override
			public void accept(Usuario t) {
				System.out.println(t.getNome());
				
			}
		};
		
		usuarios.forEach(mostrador);
		
	}
	
	@Test
	public void deveTestarComLambda() {
		
		usuarios.forEach(u -> System.out.println(u.getNome()));
		
	}

}
