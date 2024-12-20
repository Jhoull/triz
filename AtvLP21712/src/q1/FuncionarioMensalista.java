package q1;

public class FuncionarioMensalista extends Funcionario {

	private float salarioFixo;
	
	
	public FuncionarioMensalista(String nome, String cpf, float salarioFixo) {
		super(nome, cpf);
		this.salarioFixo = salarioFixo;
	}

	public float calcularPagamento() {
		return salarioFixo;
	}

	public float getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(float salarioFixo) {
		this.salarioFixo = salarioFixo;
	}
	
	
}
