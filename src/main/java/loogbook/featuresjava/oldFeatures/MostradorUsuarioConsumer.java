package loogbook.featuresjava.oldFeatures;

import java.util.function.Consumer;

import loogbook.entities.Usuario;

public class MostradorUsuarioConsumer implements Consumer<Usuario>{
	
	@Override
	public void accept(Usuario u) {
		System.out.println(u.getNome());
	}

}
