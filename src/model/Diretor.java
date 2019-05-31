package model;

public class Diretor extends Gerente {
	
	private String area;
	private String projeto;
	private int qnt_afiliais;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getProjeto() {
		return projeto;
	}
	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	public int getQnt_afiliais() {
		return qnt_afiliais;
	}
	public void setQnt_afiliais(int qnt_afiliais) {
		this.qnt_afiliais = qnt_afiliais;
	}
	
	
}
