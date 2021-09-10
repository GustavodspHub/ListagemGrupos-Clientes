package model;

import java.io.File;
import java.io.FilenameFilter;

public class ListagemEtapa02 {
	
	public static void ListagemDeDiretorios(String grupo) {

		System.out.println("---------------------------------------");
		System.out.println("Agora você está na pasta " + grupo + ". Esses são os arquivos de todos os cliente do " + grupo);
		System.out.println("\n");
		
	}
	
	public static void ListagemDeArquivos(String cliente, String grupo ) {

		File arquivos = new File(
				"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\" + cliente);

		System.out.println(cliente);

		for (File files : arquivos.listFiles()) {
			System.out.println(files.getName());
		}
		
		System.out.println("-------------------------------------------");

	}
	
}
