
import javax.swing.JOptionPane;

public class Main {

	static Circunfer�ncia c = new Circunfer�ncia();
	static Ret�ngulo r = new Ret�ngulo();
	static boolean wl = true;
	
	public static void main(String[] args) {
		int decisao;
		double raio;
		double base;
		double altura;
		
	while(wl){	
		decisao = Integer.parseInt(JOptionPane.showInputDialog("Calcular: \n\n1 - Circunfer�ncia \n2 - Ret�ngulo \n3 - Sair"));
		switch(decisao) {
			case 1:
				decisao = Integer.parseInt(JOptionPane.showInputDialog("Calcular: \n\n1 - �rea \n2 - Per�metro"));
				switch(decisao) {
					case 1:
						raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio"));
						JOptionPane.showMessageDialog(null, "�rea da Circunfer�ncia: " + c.areaCircunferencia(raio));
						break;
					case 2:
						raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio"));
						JOptionPane.showMessageDialog(null, "Per�metro da Circunfer�ncia: " + c.areaCircunferencia(raio));
						break;
					default:
						JOptionPane.showMessageDialog(null, "Escolha inv�lida");
						break;
				}
				break;
			case 2:
				decisao = Integer.parseInt(JOptionPane.showInputDialog("Calcular: \n\n1 - �rea \n2 - Per�metro"));
				switch(decisao) {
					case 1:
						base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));
						altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));
						JOptionPane.showMessageDialog(null, "�rea da Ret�ngulo: " + r.areaRetangulo(base, altura));
						break;
					case 2:
						base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));
						altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));
						JOptionPane.showMessageDialog(null, "Per�metro da Ret�ngulo: " + r.perimetroRetangulo(base, altura));
						break;
					default:
						JOptionPane.showMessageDialog(null, "Escolha inv�lida");
				}
				break;
			case 3:
				wl = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha inv�lida");
				break;
			}
		}
	}

}
