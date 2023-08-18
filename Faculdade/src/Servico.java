import javax.swing.JOptionPane;

public class Servico extends Faculdade{

public void EscolhaUsuario() {
	this.escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 para Inscrição\n2 para Teste Vocacional\n3 para Escolher Curso\n4 Para cálculo de desconto de mensalidade\n5 para Dias de aula."));


	switch (escolha) {
		case 1:
			Aluno aluno1 = new Aluno();
			aluno1.cadastrar();
		  break;
		case 2:
			Vocacional teste1 = new Vocacional();
			teste1.testeVocacional();
		  break;
		case 3:
			Curso curso1 = new Curso();
			curso1.escolhaCurso();
		  break;
		case 4:
			Desconto desc1 = new Desconto();
			desc1.calcularMensalidade();
		  break;
		case 5:
			Dias dia1 = new Dias();
			dia1.DiasAula();
		  break;
		default:
		  System.out.println("Não existe");
		}
	}
}