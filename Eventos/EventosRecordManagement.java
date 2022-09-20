// Java Program to Illustrate EventosRecordManagement Class

package Eventos;

// Importing required classes
import java.util.LinkedList;
import java.util.Scanner;

// Class
public class EventosRecordManagement {

	// Creating an empty LinkedList
	LinkedList<Record> list;

	// Default Constructor
	public EventosRecordManagement()
	{
		list = new LinkedList<>();
	}

	// Method 1
	// Adding Record
	// @param record
	public void add(Record record)
	{

		// Checking if a record already exists or not,
		// if not add it to Record list, Otherwise
		// error display message
		if (!find(record.getNumeroCpf())) {
			list.add(record);
		}
		else {

			// Print statement
			System.out.println(
				"Registro já existente");
		}
	}

	// Method 2
	// Searching Record
	// @param idNimber
	// @return
	public boolean find(int numeroCpf)
	{

		// Iterating record list
		// using for eacj loop
		for (Record l : list) {

			// Checking record by id Number
			if (l.getNumeroCpf() == numeroCpf) {

				System.out.println(l);
				return true;
			}
		}
		return false;
	}

	// Method 3
	// Delete Record
	// @param recIdNumber
	public void delete(int recNumeroCpf)
	{
		Record recordDel = null;

		// Iterating record list
		for (Record ll : list) {

			// Finding record to be deleted by id Number
			if (ll.getNumeroCpf() == recNumeroCpf) {
				recordDel = ll;
			}
		}

		// If recordDel is null, then show error message,
		// otherwise remove the record from Record list
		if (recordDel == null) {

			// Displaying no record found
			System.out.println("Invalid record Id");
		}
		else {

			list.remove(recordDel);

			// Display message for successful deletion of
			// record
			System.out.println(
				"Registro removido com sucesso!");
		}
	}

	// Method 4
	// Finding Record
	//@param numeroCpf
	// @return
	public Record findRecord(int numeroCpf)
	{

		// Iterate Record list
		// using for each loop
		for (Record l : list) {

			// Checking record by id Number.
			if (l.getNumeroCpf() == numeroCpf) {
				return l;
			}
		}

		return null;
	}

	// Method 5
	// Update Record
	// @param id
	// @param input
	public void update(int id, Scanner input)
	{

		if (find(id)) {
			Record rec = findRecord(id);
			// Display message only
			System.out.print(
				"Qual o novo CPF do estudante ? ");
			int numeroCpf = input.nextInt();
			input.nextLine();

			// Display message only
			System.out.print(
				"Qual o novo nome do estudante ? ");
			String nome = input.nextLine();

			// Display message only
			System.out.print(
				"Qual o novo sobrenome do estudante ? ");
			String sobreNome = input.nextLine();

			// Display message only
			System.out.print(
				"Qual o novo email do estudante ? ");
			String email = input.nextLine();

			// Display message only
			System.out.print(
				"Qual o novo nome da universidade do estudante? ");
			String universidade = input.nextLine();

			rec.setNome(nome);
			rec.setSobreNome(sobreNome);
			rec.setNumeroCpf(numeroCpf);
			rec.setEmail(email);
			rec.setUniversidade(universidade);
			System.out.println(
				"Registro atualizado com sucesso");
		}
		else {

			// Print statement
			System.out.println(
				"Registro não localizado");
		}
	}

	// Method 6
	// Display Records
	public void display()
	{

		// If record list is empty then
		// print the message below
		if (list.isEmpty()) {

			// Print statement
			System.out.println("Não há registros na lista\n");
		}
		// Iterating Record list
		// using for each loop
		for (Record record : list) {

			// Printing the list
			System.out.println(record.toString());
		}
	}
}
