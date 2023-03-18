package show100;

import java.util.List;

public class Apresentador {

	public void comecarShow() {
		int opcao;
		ServicoPergunta servicoP = new ServicoPergunta();
		
		do {
			System.out.println("Escolha uma opção");
			System.out.println("0. Sair");
			System.out.println("1. Cadastrar Perguntas");
			System.out.println("2. Excluir Perguntas");
			System.out.println("3. Iniciar Jogo");
			System.out.println("4. Carregar Perguntas Basicas");
			opcao = LeitorDado.lerInteiro();
			
			switch (opcao) {
				case 0:
					System.out.println("Saindo do jogo");
					break;
				case 1: 
					Pergunta p = new Pergunta();
					p.frase = LeitorDado.lerTexto();
					p.alternativa1 = LeitorDado.lerTexto();
					p.alternativa2 = LeitorDado.lerTexto();
					p.alternativa3 = LeitorDado.lerTexto();
					p.alternativa4 = LeitorDado.lerTexto();
					p.respostaCorreta = LeitorDado.lerTexto();
					p.categoria = LeitorDado.lerTexto();
					servicoP.salvar(p);
					break;
				case 2: 
					servicoP.excluir(null);
					break;
				case 3:
					List<Pergunta> perguntas = servicoP.listarTodasSimples();
					for(int i = 0; i < perguntas.size(); i++) {
						System.out.println("==================");
						System.out.println(perguntas.get(i).frase);
						System.out.println(perguntas.get(i).alternativa1);
						System.out.println(perguntas.get(i).alternativa2);
						System.out.println(perguntas.get(i).alternativa3);
						System.out.println(perguntas.get(i).alternativa4);
						System.out.println("==================");
						String alternativaPlayer = LeitorDado.lerTexto();
						if(perguntas.get(i) == null) {
							//Faz algo
						}
						if(alternativaPlayer.equals(perguntas.get(i).respostaCorreta)) {
							System.out.println("Acertou");
							//Perguntar
						} else {
							System.out.println("Errou");
							break;
						}
					}
					break;
				case 4: 
					Pergunta pergunta1 = new Pergunta();
					pergunta1.frase = "............. P E R G U N T A  01 .............\n\nQual foi o país que inventou o chuveiro elétrico ?\n";
					pergunta1.alternativa1 = "a) França";
					pergunta1.alternativa2 = "b) Inglaterra";
					pergunta1.alternativa3 = "c) Brasil";
					pergunta1.alternativa4 = "d) Austrália";
					pergunta1.respostaCorreta = "c";
					servicoP.salvar(pergunta1);
					
					Pergunta pergunta2 = new Pergunta();
					pergunta2.frase = "............. P E R G U N T A  02 .............\n\nQuem é o rei do Pop ?\n";
					pergunta2.alternativa1 = "a) Elvis Presley ";
					pergunta2.alternativa2 = "b) Bruno Mars";
					pergunta2.alternativa3 = "c) Manoel Gomes";
					pergunta2.alternativa4 = "d) Micheal Jackson";
					pergunta2.respostaCorreta = "d";
					servicoP.salvar(pergunta2);
					
					Pergunta pergunta3 = new Pergunta();
					pergunta3.frase = "............. P E R G U N T A  03 .............\n\nQuantos ossos tem um corpo humano ?\n";
					pergunta3.alternativa1 = "a) 209";
					pergunta3.alternativa2 = "b) 203";
					pergunta3.alternativa3 = "c) 201";
					pergunta3.alternativa4 = "d) 20";
					servicoP.salvar(pergunta3);
					break;
			}
			
			
			
		} while (opcao != 0);

	}

	public void fazerPergunta() {
		System.out.println("Fazendo uma pergunta");
	}

}
