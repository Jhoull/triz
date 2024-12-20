package q1;

public class FuncionarioHorista extends Funcionario{
	
	private float horasTrabalhadas;
	private float valorHora;

	
	public FuncionarioHorista(String nome, String cpf, float horasTrabalhadas, float valorHora) {
		super(nome, cpf);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}

	public float calcularPagamento() {
		return horasTrabalhadas * valorHora;
	}

	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public float getValorHora() {
		return valorHora;
	}

	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setValorHora(float valorHora) {
		this.valorHora = valorHora;
	}
	
	
}
