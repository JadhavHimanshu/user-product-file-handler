package Ecommerce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ProductManagement.Product;

public class ProductManagement {
	public static void productManagement() throws IOException {
		System.out.println("*******welcome to add product and search product management");
		Scanner sc = new Scanner(System.in);
		boolean shallKeepRunningCode = true;
		Product product = new Product();

		while (shallKeepRunningCode) {

			System.out.println("What you like to do today ");
			System.out.println("1.add product ");
			System.out.println(" 2. search product");
			System.out.println("3.Exit product");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("  add product : ");
				System.out.println(" Enter  the product name:  ");
				product.name = sc.next();

				System.out.println(" Enter  the product  quantity:  ");
				product.quantity = sc.nextInt();

				System.out.println(" Enter   price:  ");
				product.price = sc.nextInt();

				System.out.println("************* produt added sucessfully***********");

				String filepath = "/FileHandling/src/Ecommerce/product.txt";
				File file = new File(filepath);

				FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
				bufferWriter.newLine();
				bufferWriter.write(product.name + "," + product.quantity + "," + product.price);

				break;
			case 2:
				System.out.println("update product operation yet not implemented");
				break;
			case 3:
				System.out.println("       Enter Product name to search : ");
				String productNameToSearch = sc.nextLine();

				String filepath1 = "/FileHandling/src/Ecommerce/product.txt";
				File file1 = new File(filepath1);
				FileReader fileReader = new FileReader(file1);
				BufferedReader bufferReader = new BufferedReader(fileReader);
				boolean shoudContinue = true;

				while (shoudContinue) {
					String line = bufferReader.readLine();
					if (line == null && line.contains(productNameToSearch)) {
						shoudContinue = false;
						System.out.println(line);

					}

				}

			}

		}

	}

}
