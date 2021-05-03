
package program;

import java.util.Scanner;
import java.util.*;
import priority_queue.*;

public class program {
	public static final String RESET = "\u001B[0m";
	public static final String BLACK = "\u001B[30m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String BLUE = "\u001B[34m";
	public static final String PURPLE = "\u001B[35m";
	public static final String CYAN = "\u001B[36m";
	public static final String WHITE = "\u001B[37m";

	priority_queue<Pessoa> pessoas;
	Scanner scanner;
	program() throws Exception 
	{
		pessoas = new priority_queue<Pessoa>();
		scanner = new Scanner(System.in);
		Menu();
	}
	public static void main(String[] args) throws Exception 
	{
		new program();
	}

	void Menu() 
	{
		boolean continuar = true;
		try {
			while (continuar) {
				String op=Opcoes();
				switch (op) {
				case "1":
					// Cadastrar pessoa
					CRUD();
					break;
				case "2":
					// Listar fila
					pessoas.print();
					break;

				case "3":
					// Listar fila fase 1
					pessoas.print_priority(0);
					break;

				case "4":
					// Listar fila fase 2
					pessoas.print_priority(1);
					break;

				case "5":
					// Listar fila fase 3
					pessoas.print_priority(2);
					break;

				case "6":
					// Listar fila fase 4
					pessoas.print_priority(3);
					break;
					
				case "0":
					continuar = false;
					break;

				default:
					System.out.println("Opção inválida.");
					break;
				}
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
	}

	String Opcoes() throws Exception {
		print_header("Menu principal");
		System.out.println("1 - Cadastrar pessoa");
		System.out.println("2 - Listar fila");
		System.out.println("3 - Listar fila fase 1");
		System.out.println("4 - Listar fila fase 2");
		System.out.println("5 - Listar fila fase 3");
		System.out.println("6 - Listar fila fase 4");
		System.out.println("0 - Sair");
		String op = scanner.nextLine();
		clearScreen();
		// in.close();
		return op;
	}
	void print_header(String str)
	{
		System.out.println(CYAN+"------"+str+"------"+RESET);
	}
	void print_header_pessoa()
	{
		print_header("Adicionar pessoa");
	}

	void CRUD() throws Exception 
	{
		print_header_pessoa();
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		clearScreen();

		print_header_pessoa();

		
		int idade = 0;
		while(true)
		{
			try
			{
				System.out.print("Idade: ");
				idade=Integer.parseInt(scanner.nextLine());
				break;
			}
			catch(Exception e)
			{
				System.out.println("Idade invalida.");
				
			}
		}
		clearScreen();

		print_header_pessoa();
		Ocupacao.print();
		
		Ocupacao ocupacao;
		while(true)
		{
			try
			{
				System.out.print("Ocupacao: ");
				ocupacao = Ocupacao.get(scanner.nextInt());
				break;
			}
			catch (Exception e)
			{
				System.out.println("Ocupacao invalida.");
			}
		}
		
		clearScreen();
		List<Comorbidade> comorbidades=new ArrayList<Comorbidade>();
		boolean adding=true;
		while(adding)
		{
			print_header_pessoa();
			Comorbidade.print();
			System.out.println("0 para continuar");
			while(true)
			{
				try
				{
					System.out.print("Comorbidade: ");
					int comorbidadeString = scanner.nextInt();
					if(comorbidadeString==0) 
					{
						adding=false;
						break;
					}
					comorbidades.add(Comorbidade.get(comorbidadeString));
					break;
				}
				catch (Exception e)
				{
					System.out.println("Comorbidade invalida.");
				}
			}
			clearScreen();
		}
		Comorbidade[] arrComorbidade=new Comorbidade[comorbidades.size()];
		arrComorbidade = comorbidades.toArray(arrComorbidade);
		pessoas.enqueue(new Pessoa(nome, idade, ocupacao, arrComorbidade));
		clearScreen();
	}

	public static void clearScreen() throws Exception 
	{
		System.out.println("\033[H\033[2J");
		System.out.flush();
	}
}
