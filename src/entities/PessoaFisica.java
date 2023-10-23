package entities;

public class PessoaFisica extends Contribuinte {
	
	private Double health;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, double renda, double health) {
		super(nome, renda);
		this.health = health;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	@Override
	public double tax() {
		double tax;
		if (renda < 20000) {
			tax = renda * 0.15;
			if (health > 0) {
				tax -= health * 0.5;
			}
		}
		else {
			tax = renda * 0.25;
			if (health > 0) {
				tax -= health * 0.5;
			}
		}
		return tax;
	}
	
	

}
