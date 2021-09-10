import java.util.Scanner;

import model.Filtrador;
import model.ListagemEtapa01;

public class Filtrar {

	public static void main(String[] args) {
		
		Filtrador filtrar = new Filtrador(); 
				
		System.out.println("OBSERVA��O : A PASTA 'TESTE' QUE CONT�M OS GRUPOS E CLIENTES, EST� NO DESKTOP");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Bem vindo ao Sistema de arquivos e diret�rios (Etapa 01)");
		System.out.println("Escolha o seu caminho de diret�rios para visualizar seus arquivos");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1- Grupo 01");
		System.out.println("2- Grupo 02");
		System.out.println("3- Grupo 03");
		System.out.print("Digite aqui => ");
		

		Scanner leitorTerminal = new Scanner(System.in);

		int opcoesGrupo = 0;

		do {
			opcoesGrupo = leitorTerminal.nextInt();

			switch (opcoesGrupo) {
			case 1: 
				filtrar.ListagemDeDiretorios("Grupo 01");
				filtrar.FiltrarTxt("Grupo 01");

				break;

			case 2: 
				filtrar.ListagemDeDiretorios("Grupo 02");
				filtrar.FiltrarTxt("Grupo 02");
				
				break;

			case 3: 
				filtrar.ListagemDeDiretorios("Grupo 03");
				filtrar.FiltrarTxt("Grupo 03");
				
				break;

			default:
				System.out.println("Houve um erro ineperado");
				break;
			}
		} while (opcoesGrupo != 3);
				
				
	}

}
