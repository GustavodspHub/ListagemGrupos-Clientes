package model;

import java.io.File;

public class ListagemEtapa03 {
	
	public static void ListarTodosOsDocumentos(String grupo) {
		
		System.out.println("\n");
		System.out.println("Você está na pasta " + grupo + " e esses são seus clientes com seus documentos");
		System.out.println("\n");
		
		File arquivos = new File(
				"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\Cliente 01");

		System.out.println("Cliente 01");

		for (File files : arquivos.listFiles()) {
			System.out.println(files.getName());
		}
		
		System.out.println("-------------------------------------------");
		
		File arquivosUm = new File(
				"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\Cliente 02");

		System.out.println("Cliente 02");

		for (File files : arquivosUm.listFiles()) {
			System.out.println(files.getName());
		}
		
		System.out.println("-------------------------------------------");
		
		File arquivosDois = new File(
				"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\Cliente 03");

		System.out.println("Cliente 03");

		for (File files : arquivosDois.listFiles()) {
			System.out.println(files.getName());
		}
		
		System.out.println("-------------------------------------------");

	}

}
