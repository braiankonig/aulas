package br.com.senacrs.alp.aulas.trabalho5;

import br.com.senacrs.alp.aulas.minhalista.MinhaLista;
import br.com.senacrs.alp.aulas.minhalista.MinhaListaImp;

public class EmpresaImp implements Empresa {

	MinhaLista<Funcionario> lista = new MinhaListaImp<Funcionario>();

	@Override
	public void adicionaFuncionario(Funcionario funcionario) {
		if(funcionario == null){
			throw new IllegalArgumentException();
		}
		
		lista.prefixar(funcionario);
	}

	
	@Override
	public Funcionario buscaFuncionario(String nome) {

		Funcionario funcionario = null;
		FuncionarioImp funcionarioimp = null;
		Funcionario funcionarioEncontrado = null;

		for (int i = 0; i < lista.tamanho(); i++) {

			funcionario = lista.buscar(i);
			funcionarioimp = cast(funcionario);

			if(nome == funcionarioimp.getNome()){
				funcionarioEncontrado = funcionario;
			}

		}

		return funcionarioEncontrado;
	}

	@Override
	public int totalFolhaPgto() {

		Funcionario funcionario = null;
		FuncionarioImp funcionarioimp = null;
		int resultado = 0;

		for (int i = 0; i < lista.tamanho(); i++) {

			funcionario = lista.buscar(i);
			funcionarioimp = cast(funcionario);

			resultado += funcionarioimp.getSalario();

		}

		return resultado;
	}

	private FuncionarioImp cast(Funcionario funcionario){

		return (FuncionarioImp) funcionario;

	}

}