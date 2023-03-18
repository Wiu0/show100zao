package show100;

import java.util.ArrayList;
import java.util.List;

public class ServicoPergunta {

	int tam = 10;
	int posicaoAtual = 0;
	Pergunta[] listaPerguntas = new Pergunta[tam];
	List<Pergunta>  listaPerguntasSimples = new ArrayList<Pergunta>();

	public void salvar(Pergunta pergunta) {
		//Codigo para array
		listaPerguntas[posicaoAtual] = pergunta;
		posicaoAtual = posicaoAtual + 1;
	
		//codigo para lista
		listaPerguntasSimples.add(pergunta);
		

	}

	public void excluir(Pergunta pergunta) {
		System.out.println("Excluindo Pergunta");
	}

	public List<Pergunta> listarTodasSimples() {
		return listaPerguntasSimples;
	}
	
	public Pergunta[] listarTodas() {
		return listaPerguntas;
	}
}
