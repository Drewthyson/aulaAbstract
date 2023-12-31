package entities;

public abstract class Contribuinte {
	
	protected String nome;
	protected Double renda;
	
	public Contribuinte() {
		
	}

	public Contribuinte(String nome, double renda) {
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	public abstract double tax();
}
