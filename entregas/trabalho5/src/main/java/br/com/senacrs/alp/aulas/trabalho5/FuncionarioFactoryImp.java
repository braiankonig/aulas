package br.com.senacrs.alp.aulas.trabalho5;

public class FuncionarioFactoryImp {
	
	private static FuncionarioFactoryImp func = new FuncionarioFactoryImp();

	public Funcionario criaFuncionario(String nome, int salario) {

		if(nome == null || nome == "" || salario < 0){

			throw new IllegalArgumentException();

		}

		FuncionarioImp funcionario = new FuncionarioImp(nome, salario);	

		return funcionario;
	}

	public static FuncionarioFactoryImp getInstancia() {

		return FuncionarioFactoryImp.func;
	}

}
	

