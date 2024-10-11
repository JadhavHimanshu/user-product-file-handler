package Ecommerce;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserManagment {
	private static final BufferedWriter bufferWriter = null;

	public static void main(String args) throws IOException {
		System.out.println("#####welcome to user input #######");
		Scanner sc = new Scanner(System.in);

		String filepath = ("/FileHandling/src/Ecommerce/product.txt");
		File file = new File(filepath);
		FileWriter fileWriter = new FileWriter(file, true);
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);

		boolean shouldContinue = true;
		while (shouldContinue) {
			System.out.println("what would you like  to do today ");
			System.out.println(" 1. Write line information to the file ");
			System.out.println("2.Exit");
			int option = sc.nextInt();

			switch (option) {

			case 1:
				System.out.println("what would you like to do today");
				Scanner lineScanner = new Scanner(System.in);
				String line = lineScanner.nextLine();

				bufferWriter.newLine();
				bufferWriter.write(line);
				bufferWriter.flush();
				break;
			case 2:
				shouldContinue = false;

			}

		}

		bufferWriter.close();
		sc.close();
	}
}
