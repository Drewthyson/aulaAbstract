package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double renda = sc.nextDouble();
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new PessoaFisica(name, renda, health));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new PessoaJuridica(name, renda, employees));
			}
		}
		
		double sum = 0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Contribuinte x : list) {
			System.out.println(x.getNome() + ": $" + String.format("%.2f", x.tax()));
			sum += x.tax();
		}
		
		System.out.println();
		System.out.println("Total Taxes: $" + String.format("%.2f", sum));
		
		sc.close();
	}

}
