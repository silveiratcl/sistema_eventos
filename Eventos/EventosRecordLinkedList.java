// Java Program to Illustrate StudentRecordLinkedList Class

package Eventos;

// Importing required classes
import java.util.Scanner;

// Class
public class EventosRecordLinkedList {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating HumanResourceOffice Object.
		EventosRecordManagement
		hr = new EventosRecordManagement(); // hr save this to data

		Record record = new Record();

			// Initial Employee record
			// Using mutators to had code the data
		record.setNome( "Thiago");
		record.setSobreNome( "Silveira");
		record.setNumeroCpf( 99999999);
		record.setEmail("thiago@gmail.com");
		record.setUniversidade("ufsc");

		// Calling add() record method to
		// add static data/(Hard CodedData) to linked List
		hr.add(record);

		// Creating Scanner Object to read input
		Scanner input = new Scanner(System.in);

		// Creating option integer variable
		int option = 0;

		// Do - While loop
		do {
			menu();
			option = input.nextInt();

			// Switch case
			switch (option) {

			// Case 1
			case 1:

				// Display message
				System.out.print(
					"Qual seu nome ? ");

				String nome = input.nextLine();
				input.nextLine();

				// Display message
				System.out.print(
					"Qual seu sobrenome ? ");

				String sobreNome = input.nextLine();

				// Display message
				System.out.print(
					"Qual seu CPF ? ");

				int numeroCpf = input.nextInt();
				input.nextLine();

				// Display message
				System.out.print(
					"Qual seu email ? ");

				String email = input.nextLine();

				// Display message
				System.out.print(
					"Qual sua Universidade ? ");

				String universidade = input.nextLine();


				// Create record object and pass constructor
				// parameters.
				record = new Record(nome, sobreNome, numeroCpf, email, universidade);

				// Call add() record
				hr.add(record);
				System.out.println(record.toString());

				// Break statement used to terminate program
				// from here only once it entered this case
				break;

			// Case 2///////////////////////////////////////
			case 2:

				// Display message
				System.out.print(
					"Qual seu email ? ");
				int rEmail = input.nextInt();

				// Invoke remove/delete record
				hr.delete(rEmail);

				break;

			// Case 3
			case 3:

				// Display message
				System.out.print(
					"Qual seu cpf ? ");

				int rCpf = input.nextInt();
				hr.update(rCpf, input);

				break;

			// Case 4
			case 4:

				// Display message
				System.out.print(
					"Qual seu cpf ? ");
				int bookId = input.nextInt();

				if (!hr.find(bookId)) {
					System.out.println(
						"Student id does not exist\n");
				}

				break;

			// Case 5
			case 5:
				hr.display();
				break;

			// Case 6
			case 9:

				// Display message
				System.out.println(
					"\nObrigado por usar o sistema. Até mais!\n");
				System.exit(0);

				break;

			// Case 7: Default case
			// If none above case executes
			default:

				// Print statement
				System.out.println("\nInput inválido\n");
				break;
			}
		}

		// Checking condition
		while (option != 9);
	}

	// Method 2
	// Menu - Static menu for displaying options
	public static void menu()
	{

		// Printing statements displaying menu on console
		System.out.println("MENU");
		System.out.println("1: Adicionar Estudante");
		System.out.println("2: Deletar Estudante");
		System.out.println("3: Atualizar Estudante");
		System.out.println("4: Procurar  Estudante");
		System.out.println("5: Listar Estudantes");
		System.out.println("9: Sair");
		System.out.print("Digite sua opção : ");
	}
}
