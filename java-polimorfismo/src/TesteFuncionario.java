
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario fu = new Funcionario();
		fu.setNome("Daniel");
		fu.setCpf("333.333.333.-33");
		fu.setSalario(2500);
		
		System.out.println(fu.getNome());
		System.out.println(fu.getBonificacao());
	}

}
