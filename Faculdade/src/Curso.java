import javax.swing.JOptionPane;

// Classe para a escolha do curso
public class Curso extends Faculdade {
	
	public void escolhaCurso() {
		
		// Mostrando as opções na tela
		String m = "Curso - Chegou a hora de escolher: \n"
				 + "Digite 1 para Administração \n"
				 + "Digite 2 para Análise e Desenvolvimento de Sistemas \n"
				 + "Digite 3 para Biomedicina \n"
				 + "Digite 4 para Direito \n"
				 + "Digite 5 para Enfermagem \n";
		
		this.curso = Integer.parseInt(JOptionPane.showInputDialog(m));
		
		if(curso >= 1 && curso <= 5)
		{		
			// Condições para exibir o curso escolhido de acordo com o número do mesmo
			if (this.curso == 1)
			{
				String b = "Parabéns, você escolheu Administração!";
				JOptionPane.showMessageDialog(null, b);
				
			} else if (this.curso == 2) {
				String c = "Parabéns, você escolheu Análise e Desenvolvimento de Sistemas!";
				JOptionPane.showMessageDialog(null, c);
				
			} else if (this.curso == 3) {
				String d = "Parabéns, você escolheu Biomedicina!";
				JOptionPane.showMessageDialog(null, d);
				
			} else if (this.curso == 4) {
				String e = "Parabéns, você escolheu Direito!";
				JOptionPane.showMessageDialog(null, e);
				
			} else if (this.curso == 5) {
				String f = "Parabéns, você escolheu Enfermagem!";
				JOptionPane.showMessageDialog(null, f);
				
			} 
		}
		else {
			JOptionPane.showMessageDialog(null, "Curso escolhido não está na listagem.");
		}
		
	}
}