import javax.swing.JOptionPane;

public class Desconto extends Faculdade{
	// Objetivo: calcular o valor da mensalidade
	
			// Atributos
			private String b = "Valor da mensalidade com desconto a pagar: ";			
			private double valorTotal;
			
			public double getValorTotal() {
				return valorTotal;
			}

			public void setValorTotal(double valorTotal) {
				this.valorTotal = valorTotal;
			}	
			

			public void calcularMensalidade() {			
				this.escolha = Integer.parseInt(JOptionPane.showInputDialog("Confirme o curso\n"
																		  + "Digite:\n"
																		  + "1 para Administração\n"
																		  + "2 para Análise e Desenvolvimento de Sistemas\n"
																		  + "3 para Biomedicina\n"
																		  + "4 para Direito\n"
																		  + "5 para Enfermagem \n"));
				switch(this.escolha) {
				case 1:
					this.valor = 500.00;
					this.desconto = descontoFaculdade(10);
					break;
				case 2:
					this.valor = 600.00;
					this.desconto = descontoFaculdade(30);
					break;
				case 3:
					this.valor = 800.00;
					this.desconto = descontoFaculdade(20);
					break;
				case 4:
					this.valor = 1100.00;
					this.desconto = descontoFaculdade(50);
					break;
				case 5:
					this.valor = 1200.00;
					this.desconto = descontoFaculdade(40);
					break;
			}

				
				if(escolha >= 1 && escolha <= 5) {
					this.valorTotal = this.valor - (this.valor * (this.desconto / 100));
					JOptionPane.showMessageDialog(null, b + "R$: " + this.valorTotal);	
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Opção invalida!");
				}
			}
			
			@Override
			public double descontoFaculdade(double desconto) {
				this.desconto = desconto + 10; 
				return this.desconto;
			}
			
			
	}
