package br.com.pandasi.view;

import java.util.Scanner;

import br.com.pandasi.model.Motoqueiro;

public class TelaInicio {

	private Scanner teclado = new Scanner(System.in);
	
	public void iniciar() {
		Integer opcao;
		do {
			System.out.println("Escolha a opção desejada:"
					+ "\n\t 1 - Cadastrar Motoqueiro"
					+ "\n\t 2 - Criar Rota"
					+ "\n\t 0 - Sair do Sistema");
			opcao = teclado.nextInt();
			
			switch (opcao) {
			case 1:
				Motoqueiro motoqueiro = new Motoqueiro();
				motoqueiro.setId(1);
				System.out.print("Informe o nome do motoqueiro: ");
				motoqueiro.setNome(teclado.next());
				System.out.print("Informe o Veiculo do motoqueiro: ");
				motoqueiro.setVeiculo(teclado.next());
				System.out.println("Informe a Placa do Veiculo");
				motoqueiro.setPlaca(teclado.next());
				break;
			case 2:
				
				break;	
			default:
				break;
			}
			
		} while (!opcao.equals(0));
		
	}

}
