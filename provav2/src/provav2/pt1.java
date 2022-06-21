package provav2;


	import javax.swing.JOptionPane;
	import java.util.*;
	public class pt1 {

		public static void main(String[] args) {
			 int i;
		     ArrayList<String> fipe = new ArrayList();

		     do
		     {
		     String menu= JOptionPane.showInputDialog("MENU\n1-Cadastrar Carro \n2-Listagem Geral\n3-Mostrar Resultados \n4-SAIR ");
		     i = Integer.parseInt(menu);
		     switch (i)
		        {
		             case 1:
		                String Marcacarro= JOptionPane.showInputDialog("Digite o Marca: ");
		                
		                String ModeloCarro= JOptionPane.showInputDialog("O Modelo do carro: ");
		                String Ano = JOptionPane.showInputDialog("O Ano do carro: ");
		                String Valor= JOptionPane.showInputDialog("O Valor do carro: ");
		                fipe.add(Marcacarro+";"+ModeloCarro+";"+Ano+";"+Valor);
		                JOptionPane.showMessageDialog(null, " Cadastrado com sucesso");
		                
		                 break;
		             case 2:
		            	
		            	 System.out.println(fipe.toString());
		                 break;
		             case 3:
		            	
		            	 
		                 break;
		            
		                
		             case 4:
		                 break;
		             default:
		                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
		        }
		     } while (i!=4);
		     
		}

	}