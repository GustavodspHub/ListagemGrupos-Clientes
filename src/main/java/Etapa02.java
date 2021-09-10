import java.util.Scanner;

import model.ListagemEtapa02;

public class Etapa02 {

	public static void main(String[] args) {
		
		ListagemEtapa02 listagem = new ListagemEtapa02();
		
		Scanner leitorTerminal = new Scanner(System.in);

		int opcoesGrupo = 0;
		
		System.out.println("OBSERVAÇÃO : A PASTA 'TESTE' QUE CONTÉM OS GRUPOS E CLIENTES, ESTÁ NO DESKTOP");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Bem vindo ao Sistema de arquivos e diretórios (Etapa 02)");
		System.out.println("Escolha o seu grupo para visualizar todos os arquivos de seus clientes");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1- Grupo 01");
		System.out.println("2- Grupo 02");
		System.out.println("3- Grupo 03");
		System.out.print("Digite aqui => ");
		
		do {
			
			opcoesGrupo = leitorTerminal.nextInt();
			switch(opcoesGrupo) {
				
			case 1:
				listagem.ListagemDeDiretorios("Grupo 1");
				listagem.ListagemDeArquivos("Cliente 01", "Grupo 01");
				listagem.ListagemDeArquivos("Cliente 02", "Grupo 01");
				listagem.ListagemDeArquivos("Cliente 03", "Grupo 01");
				break;
				
			case 2:
				listagem.ListagemDeDiretorios("Grupo 2");
				listagem.ListagemDeArquivos("Cliente 01", "Grupo 02");
				listagem.ListagemDeArquivos("Cliente 02", "Grupo 02");
				listagem.ListagemDeArquivos("Cliente 03", "Grupo 02");
			break;
			
			case 3:
				listagem.ListagemDeDiretorios("Grupo 3");
				listagem.ListagemDeArquivos("Cliente 01", "Grupo 03");
				listagem.ListagemDeArquivos("Cliente 02", "Grupo 03");
				listagem.ListagemDeArquivos("Cliente 03", "Grupo 03");
			break;
			}
				
			
		}while(opcoesGrupo != 3);
	}

}
