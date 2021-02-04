package loogbook.featuresjava.lambda;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import loogbook.entities.Usuario;

public class LambdaTest {

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
	public void deveRemoverUmItem() {

		usuarios.removeIf(u -> u.getPontos() > 30);

		assertThat(usuarios.size()).isEqualTo(2);

	}

}
