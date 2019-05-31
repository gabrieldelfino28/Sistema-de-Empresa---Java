package model;

public abstract class Secretaria extends Funcionario {
	
	private String funcao;
	private int n_agendapresidente;
	private int n_agendagerente;
	private int n_agendadiretor;
	
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public int getN_agendapresidente() {
		return n_agendapresidente;
	}
	public void setN_agendapresidente(int n_agendapresidente) {
		this.n_agendapresidente = n_agendapresidente;
	}
	public int getN_agendagerente() {
		return n_agendagerente;
	}
	public void setN_agendagerente(int n_agendagerente) {
		this.n_agendagerente = n_agendagerente;
	}
	public int getN_agendadiretor() {
		return n_agendadiretor;
	}
	public void setN_agendadiretor(int n_agendadiretor) {
		this.n_agendadiretor = n_agendadiretor;
	}
	
	

}
