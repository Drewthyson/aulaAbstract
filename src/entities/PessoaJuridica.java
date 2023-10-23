package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer funcionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double renda, int funcionarios) {
		super(nome, renda);
		this.funcionarios = funcionarios;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}

	@Override
	public double tax() {
		double tax;
		if (funcionarios > 10) {
			tax = renda * 0.14;
		}
		else {
			tax = renda * 0.16;
		}
		return tax;
	}

}
