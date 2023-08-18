public class Faculdade {
	
	public int curso;
	public int escolha;
	public double valor;
	public double desconto;
	
	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getCurso() {
		return curso;
	}
	
	public void setCurso(int curso) {
		this.curso = curso;
	}
	
	public int getEscolha() {
		return escolha;
	}
	
	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}
	
	public double descontoFaculdade(double desconto){
		this.desconto = 10; 
		return this.desconto;
	}
}
