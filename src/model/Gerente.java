package model;

public class Gerente extends Funcionario {	
	private String agenda;
	private String empresa;
	private float bonificacao;
	private int n_funcionarios;
	
	public float getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(float bonificacao) {
		this.bonificacao = bonificacao;
	}
	public String getAgenda() {
		return agenda;
	}
	public void setAgenda(String agenda) {
		this.agenda = agenda;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getN_funcionarios() {
		return n_funcionarios;
	}
	public void setN_funcionarios(int n_funcionarios) {
		this.n_funcionarios = n_funcionarios;
	}
	
}
