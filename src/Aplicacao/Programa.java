package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Funcionario F = new Funcionario();
		
		System.out.print("Nome: ");
			F.Nome = sc.nextLine();
		System.out.print("Salario Bruto: ");
			F.SalarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
			F.Imposto = sc.nextDouble();
		
		System.out.printf("Empregado: "+F.Nome+", $ %.2f",F.SalarioLiquido());
		System.out.println();
		
		System.out.print("Qual percentual para aumentar o salário? ");
			double Porcentagem = sc.nextDouble();
			F.AumentoSalarial(Porcentagem);
			
		System.out.println();
		System.out.println("Dados atualizados: "+F);
		
		
			
		
		
		
		
		sc.close();

	}

}
