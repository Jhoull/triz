package q1;

public class ProgramaFuncionario {
	
	
	public static void main(String[] args) {
		Funcionario f1 = new FuncionarioHorista("Manoela","34521356776",40,50);
		Funcionario f2 = new FuncionarioHorista("João","34598765489",45,55);
		Funcionario f3 = new FuncionarioMensalista("Victor","34578609845",2100);
		Funcionario f4 = new FuncionarioMensalista("Beatriz","45643290876",1400);
		
		imprimirPagamento(f1);
		imprimirPagamento(f2);
		imprimirPagamento(f3);
		imprimirPagamento(f4);
		
		
	}
	
	
	public static void imprimirPagamento(Funcionario f){
		System.out.println("Funcionário: " + f.getNome());
        System.out.println("CPF: " + f.getCpf());
        System.out.println("Pagamento: R$ " + f.calcularPagamento());
        System.out.println("-----------------------------");
	}

}
