import javax.swing.JOptionPane;

public class Vocacional extends Faculdade{

	public void testeVocacional() {
		// Exibindo mensagem na tela
		String m = "Para melhor ajudá-lo, vamos verificar a sua vocação. \n"
				 + "Digite o número da afirmação que mais se aproxima com o que deseja fazer. \n"
				 + "Digite 1 se você gosta de lidar com cálculos, gerenciamento de recursos em um ambiente formal. \n"
				 + "Digite 2 se você gosta de decifrar sequências lógicas em um trabalho silencioso. \n"
				 + "Digite 3 se você ama entender a vida e gostaria de ajudar a humanidade em relação a doenças. \n"
				 + "Digite 4 se você gosta de leis e gostaria de ajudar as pessoas a terem seus direitos garantidos. \n"
				 + "Digite 5 se você gostaria de ajudar as pessoas em seus processos de cura. \n";
		
		JOptionPane.showMessageDialog(null, m);
		
		// Condições para exibir a vocação escolhida de acordo com o número do mesma
		while ((this.escolha < 1) || (this.escolha > 5)) 
		{
			String a = "Escolha uma vocação de 1 a 5.";
			JOptionPane.showMessageDialog(null, a);
			
			this.escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua vocação."));
		
			if (this.escolha == 1)
			{
				String b = "Legal! Você se daria bem com Administração!";
				JOptionPane.showMessageDialog(null, b);
				
			} else if (this.escolha == 2) {
				String c = "Legal! Você se daria bem com Análise e Desenvolvimento de Sistemas!";
				JOptionPane.showMessageDialog(null, c);
				
			} else if (this.escolha == 3) {
				String d = "Legal! Você se daria bem com Biomedicina!";
				JOptionPane.showMessageDialog(null, d);
				
			} else if (this.escolha == 4) {
				String e = "Legal! Você se daria bem com Direito!";
				JOptionPane.showMessageDialog(null, e);
				
			} else if (this.escolha == 5) {
				String f = "Legal! Você se daria bem com Enfermagem!";
				JOptionPane.showMessageDialog(null, f);
				
			}
		}
	}
}