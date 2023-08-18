import javax.swing.JOptionPane;

public class Dias extends Faculdade {
	
		public void DiasAula() {
			
		String m = "Curso - Chegou a hora de escolher: \n"
				 + "Digite 1 para Administração \n"
				 + "Digite 2 para Análise e Desenvolvimento de Sistemas \n"
				 + "Digite 3 para Biomedicina \n"
				 + "Digite 4 para Direito \n"
				 + "Digite 5 para Enfermagem \n";
		
		JOptionPane.showMessageDialog(null, m);
		this.curso = Integer.parseInt(JOptionPane.showInputDialog("Digite o curso desejado: "));

		switch (curso) {
			case 1:
				String a = "Segunda: Administração Terça: Análise e Desenvolvimento de Sistemas Quarta: Biomedicina Quinta: Enfermagem Sexta: N/A.";
				JOptionPane.showMessageDialog(null, a);
			  break;
			case 2:
				String b = "Segunda: N/A Terça: Enfermagem Quarta: Administração Quinta: Direito Sexta: Biomedicina.";
				JOptionPane.showMessageDialog(null, b);
			  break;
			case 3:
				String c = "Segunda: Direito Terça: Enfermagem Quarta: N/A Quinta: Biomedicina Sexta: Administração";
				JOptionPane.showMessageDialog(null, c);
			  break;
			case 4:
				String d = "Segunda: Análise e Desenvolvimento de Sistemas Terça: Administração Quarta: Enfermagem Quinta: N/A Sexta: Direito";
				JOptionPane.showMessageDialog(null, d);
			  break;
			case 5:
				String e = "Segunda: Administração Terça: Direito Quarta: N/A Quinta: Análise e Desenvolvimento de Sistemas Sexta: Enfermagem";
				JOptionPane.showMessageDialog(null, e);
			default:
			  System.out.println("Não existe");
			}
		}
	}
