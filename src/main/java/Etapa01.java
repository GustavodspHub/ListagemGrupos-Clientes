
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Scanner;

import model.ListagemEtapa01;


public class Etapa01 {

	public static void main(String[] args) {
		System.out.println("OBSERVAÇÃO : A PASTA 'TESTE' QUE CONTÉM OS GRUPOS E CLIENTES, ESTÁ NO DESKTOP");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Bem vindo ao Sistema de arquivos e diretórios (Etapa 01)");
		System.out.println("Escolha o seu caminho de diretórios para visualizar seus arquivos");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1- Grupo 01");
		System.out.println("2- Grupo 02");
		System.out.println("3- Grupo 03");
		System.out.print("Digite aqui => ");
		
		ListagemEtapa01 listagem = new ListagemEtapa01();

		Scanner leitorTerminal = new Scanner(System.in);

		int opcoesGrupo = 0;

		do {
			opcoesGrupo = leitorTerminal.nextInt();

			switch (opcoesGrupo) {
			case 1: 
				listagem.ListagemDeDiretorios("Grupo 01");
				listagem.ListagemDeArquivos("Grupo 01");

				break;

			case 2: 
				listagem.ListagemDeDiretorios("Grupo 02");
				listagem.ListagemDeArquivos("Grupo 02");
				
				break;

			case 3: 
				listagem.ListagemDeDiretorios("Grupo 03");
				listagem.ListagemDeArquivos("Grupo 03");
				
				break;

			default:
				System.out.println("Houve um erro ineperado");
				break;
			}
		} while (opcoesGrupo != 3);

	}

}
