// Java Program to Illustrate Eventos

package Eventos;

// Classe
public class Record {

	// Variaveis da instancia
	private String nome;
	private String sobreNome;
	private int numeroCpf;
	private String email;
	private String universidade;

	// Default Constructor
	public Record() {}

	// Parameterized Constructor
	// @param name
	// @param idNumber
	// @param contactNumber
	public Record(
				String nome,
				String sobreNome,
				int numeroCpf,
				String email,
				String universidade)
	{

		// this keyword refers to current instance itself
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.numeroCpf = numeroCpf;
		this.email = email;
		this.universidade = universidade;

	}

	// Getting the value of getNumeroCpf
	// @return the value of getNumeroCpf
	public int getNumeroCpf() { return numeroCpf; }

	// Set the value of setNumeroCpf
	// @param setNumeroCpf new value of setNumeroCpf
	/**
	//@param
	 */
	public void setNumeroCpf(int numeroCpf)
	{
		this.numeroCpf = numeroCpf;
	}

	// Getting the value of email
	// @return the value of email
	public String getEmail() { return email; }

	// Setting the value of email
	// @param email new value of email
	public void setEmail(String email)
	{
		this.email = email;
	}

	// Getting the value of name
	// @return the value of name
	public String getNome() { return nome; }

	// Setting the value of name
	// @param name new value of name
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/// adds

	// Getting the value of sobrename
	// @return the value of sobrename
	public String getSobreNome() { return sobreNome; }

	// Setting the value of sobrenome
	// @param name new value of sobrename
	public void setSobreNome(String sobreNome)
	{
		this.sobreNome = sobreNome;
	}


	// Getting the value of universidade
	// @return the value of universidade
	public String getUniversidade() { return universidade; }

	// Setting the value of sobrenome
	// @param name new value of sobrename
	public void setUniversidade(String universidade)
	{
		this.universidade = universidade;
	}


	/// end ads
	// toString() Method
	// @return
	@Override public String toString()
	{

		// Returning the record
		return "Records{"
			+ "nome=" + nome +
			", sobreNome=" + sobreNome +
			", numeroCpf=" + numeroCpf +
			", email=" + email +
			", universidade=" + universidade + '}';
	}
}

