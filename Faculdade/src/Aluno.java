import javax.swing.JOptionPane;

public class Aluno extends Faculdade {

	// Classe responsável pelo cadastro do aluno ingressante
	private String nome;
	private String email;
	private String telefone;
	private String nomeMae;
	private String cpf;
	private String dtnasc;
	private String cidade;
	private String estado;
	
	// Get e set - Acessores dos atributos privados
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getNomeMae() {
		return nomeMae;
	}
	
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDtnasc() {
		return dtnasc;
	}
	
	public void setDtnasc(String dtnasc) {
		this.dtnasc = dtnasc;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public void cadastrar() {
		// Exibindo mensagens na tela
		String m = "Bem vindo(a) ao portal de cursos da FACSP! \n"
				 + "Muito bom ter você aqui com a gente. \n"
				 + "Temos 5 cursos disponiveis no momento. \n"
				 + "Para começar, vamos precisar de algumas informações. \n";
		
		JOptionPane.showMessageDialog(null, m);

		// Pedindo os dados
		this.nome = JOptionPane.showInputDialog("Qual o seu nome completo?");
		this.email = JOptionPane.showInputDialog("Qual o seu e-mail?");
		this.telefone = JOptionPane.showInputDialog("Qual o seu número com DDD?");
		this.nomeMae = JOptionPane.showInputDialog("Qual o nome da sua mãe completo?");
		this.cpf = JOptionPane.showInputDialog("Digite o seu CPF sem traços ou pontos.");
		this.dtnasc = JOptionPane.showInputDialog("Digite a sua data de nascimento.");
		this.cidade = JOptionPane.showInputDialog("Digite o nome da sua cidade atual.");
		this.estado = JOptionPane.showInputDialog("Digite o nome do seu estado.");
		
		JOptionPane.showMessageDialog(null, "Nome completo: " + nome + "\n"
										  + "Email: " + email + "\n"
										  + "Telefone: " + telefone + "\n"
										  + "Nome da mãe: " + nomeMae + "\n"
										  + "CPF: " + cpf + "\n"
										  + "Data Nascimento: " + dtnasc + "\n"
										  + "Cidade: " + cidade + "\n"
										  + "Estado: " + estado + "\n");
		
		Desconto desconto1 = new Desconto();
		desconto1.calcularMensalidade();
		
		String k = "Cadastro Realizado!";
		JOptionPane.showMessageDialog(null, k);
	}
}
