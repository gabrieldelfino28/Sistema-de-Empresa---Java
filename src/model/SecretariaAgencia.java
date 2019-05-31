package model;

public class SecretariaAgencia extends Secretaria {
	
	private float bonificacao;
	private int cod_agencia;
	private String tipo;
		
	public float getBonificacao() {
		return bonificacao;
	}
	public void setBonificacao(float bonificacao) {
		this.bonificacao = bonificacao;
	}
	public int getCod_agencia() {
		return cod_agencia;
	}
	public void setCod_agencia(int cod_agencia) {
		this.cod_agencia = cod_agencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
	
}
