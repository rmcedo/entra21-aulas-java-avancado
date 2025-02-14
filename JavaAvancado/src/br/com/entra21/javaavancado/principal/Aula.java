package br.com.entra21.javaavancado.principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Aula {// classe que parece um algoritmo

	private Scanner entrada = new Scanner(System.in);
	private String titulo;
	private ArrayList<String> assuntos;

	public Aula(String titulo, ArrayList<String> assuntos) {
		super();
		this.titulo = titulo;
		this.assuntos = assuntos;
	}

	public void aprender() {
		
		do {
			System.out.println("=========>   MENU " + this.titulo + "   <==================");
			System.out.println("-1 = Sair");
			System.out.println(" 0 = Voltar");
			if (assuntos != null && !assuntos.isEmpty()) {
				for (int contador = 0; contador < assuntos.size(); contador++) {
					System.out.println(" " + (contador + 1) + " = " + assuntos.get(contador));
				}
			} else {
				System.out.println("N�o h� itens especificos para essa aula???");
			}

		} while (capturarOpcao() != 0);
	}

	public byte capturarOpcao() {
		byte opcao;
		opcao = entrada.nextByte();

		switch (opcao) {

		case -1:
			System.exit(-1);
			break;
		case 0:
			System.out.println("At� a proxima!");
			break;
		}
		//UM OVERRIDE QUE APROVEITA MEU C�DIGO
		//� COMO ELE ESTIVESSE SIDO ESCRITO AQUI
		
		return opcao;
	}

	public String getTitulo() {
		return titulo;
	}

	public Scanner getEntrada() {
		return entrada;
	}

	public void setEntrada(Scanner entrada) {
		this.entrada = entrada;
	}
	
	

}