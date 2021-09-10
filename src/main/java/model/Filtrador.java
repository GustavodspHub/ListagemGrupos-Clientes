package model;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Filtrador  {
	
public static void ListagemDeDiretorios(String grupo) {
		
		System.out.println("\n");
		
		File clientes = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo);
		String[] diretorios = clientes.list();
		
		for (String diretorio : diretorios) {
			System.out.println(diretorio);
		}
		
		System.out.println("\n");
		
		System.out.println("---------------------------------------");
		System.out.println("Agora você está na pasta " + grupo + ". Escolha o seu cliente ");
		System.out.println("1- Cliente 01");
		System.out.println("2- Cliente 02");
		System.out.println("3- Cliente 03");
		System.out.print("Escolha aqui => ");
	}
	
	public static void FiltrarTxt (String grupo) {
		
		Scanner leitorTerminal = new Scanner(System.in);

		int opcoesCliente = 0;
		
		do {
			opcoesCliente = leitorTerminal.nextInt();

			switch (opcoesCliente) {

			case 1: 
				
				File arquivosCliente01 = new File(
						"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\" + "Cliente 01");

				System.out.println("---------------------------------------");

				System.out.println("Você escolheu o Cliente 01 do " + grupo + " e esses são seus arquivos de texto: \n");

				for (File files : arquivosCliente01.listFiles(
						new FileFilter() {
							public boolean accept(File files) {
								return files.getName().endsWith(".txt");
							}
						}
						)) {
					System.out.println(files.getName());
				}
				
				;
				break;

			case 2: 
				
				File arquivosCliente02 = new File(
						"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\" + "Cliente 02");

				System.out.println("---------------------------------------");

				System.out.println("Você escolheu o Cliente 02 do " + grupo + " e esses são seus arquivos de texto: \n");

				for (File files : arquivosCliente02.listFiles(
						new FileFilter() {
							public boolean accept(File files) {
								return files.getName().endsWith(".txt");
							}
						}
						)) {
					System.out.println(files.getName());
				}
				
				break;

			case 3: 
				
				File arquivosCliente03 = new File(
						"C:\\Users\\" + System.getProperty("user.name") + "\\Desktop\\Teste\\" + grupo + "\\" + "Cliente 03");

				System.out.println("---------------------------------------");

				System.out.println("Você escolheu o Cliente 03 do " + grupo + " e esses são seus arquivos de texto: \n");

				for (File files : arquivosCliente03.listFiles(
						new FileFilter() {
							public boolean accept(File files) {
								return files.getName().endsWith(".txt");
							}
						}
						)) {
					System.out.println(files.getName());
				}
				
				break;

			default:
				break; 
			}

		} while (opcoesCliente != 3);
	}
	}
	
