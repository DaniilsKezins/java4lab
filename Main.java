// 000RDB000 Jānis Programmētājs 1

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("000RDB000 Jānis Programmētājs 1. grupa");

		String fileName;
		System.out.println("input file name:");
		fileName = sc.nextLine();
		sc.close();

		FileReader fr = new FileReader(fileName);
		Scanner fileScanner = new Scanner(fr);

		// ievadīto no tastatūras faila nosaukumu fileName nemodificēt,
		// nepievienot mapes vārdu, nepievienot tipu txt

		while (fileScanner.hasNextLine()) {
			System.out.println(fileScanner.nextLine());
		}

		System.out.println("result:");

		// izvadīt rezultātus

	}

}
