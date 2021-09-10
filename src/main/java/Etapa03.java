import java.util.Scanner;


import model.ListagemEtapa03;

public class Etapa03 {

	public static void main(String[] args) {
		
		ListagemEtapa03 listagem = new ListagemEtapa03();
		Scanner leitorTerminal = new Scanner(System.in);
		
		System.out.println("OBSERVAÇÃO : A PASTA 'TESTE' QUE CONTÉM OS GRUPOS E CLIENTES, ESTÁ NO DESKTOP");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Bem vindo ao Sistema de arquivos e diretórios (Etapa 03)");
		System.out.println("Clique no número 1 para visualizar todos os arquivos de todos os clientes de todos os grupos");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("1- Listar tudo");
		System.out.print("Digite aqui => ");

		int IniciadorDaListagem = 0;
		IniciadorDaListagem = leitorTerminal.nextInt();

		
		
		if(IniciadorDaListagem == 1) {
			listagem.ListarTodosOsDocumentos("Grupo 01");
			listagem.ListarTodosOsDocumentos("Grupo 02");
			listagem.ListarTodosOsDocumentos("Grupo 03");
		}else {
			System.out.println("Houve um erro");
		}
	}

}
