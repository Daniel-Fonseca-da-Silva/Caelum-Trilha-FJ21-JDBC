package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import java.util.Calendar;

public class TestaInsere {

	public static void main(String[] args) {
				
		// pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Daniel");
		contato.setEmail("daniel@gmail.com.br");
		contato.setEndereco("R. Sem Sombra 0000 cm5121");
		contato.setDataNascimento(Calendar.getInstance());
		
		// grave nessa conexão!!!
		ContatoDao dao = new ContatoDao();
		
		// método elegante
		dao.adiciona(contato);
		System.out.println("Gravado!");
		
	}

}
