package br.com.senacrs.alp.aulas.minhalista;

public interface MinhaLista<Tipo extends Object>{
	
	void sufixar(Tipo valor);
	
	void prefixar(Tipo valor);
	
	Tipo buscar (int posicao);
	
	void inserir(int posicao, Tipo valor);
	
	Tipo remover(int posicao);
	
	int tamanho();

}
