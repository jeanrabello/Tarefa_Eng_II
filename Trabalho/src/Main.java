
import javax.swing.JOptionPane;

public class Main {

	static Circunferência c = new Circunferência();
	static Retângulo r = new Retângulo();
	static boolean wl = true;
	
	public static void main(String[] args) {
		String decisao;
		double raio;
		double base;
		double altura;
		
	while(wl){	
		decisao = JOptionPane.showInputDialog("Calcular: \n\n1 - Circunferência \n2 - Retângulo \n3 - Sair");
		switch(decisao) {
			case "1":
				decisao = JOptionPane.showInputDialog("Calcular: \n\n1 - Área \n2 - Perímetro");
				switch(decisao) {
					case "1":
						raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio"));
						JOptionPane.showMessageDialog(null, "Área da Circunferência: " + c.areaCircunferencia(raio));
						break;
					case "2":
						raio = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do raio"));
						JOptionPane.showMessageDialog(null, "Perímetro da Circunferência: " + c.areaCircunferencia(raio));
						break;
					default:
						JOptionPane.showMessageDialog(null, "Escolha inválida");
						break;
				}
				break;
			case "2":
				decisao = JOptionPane.showInputDialog("Calcular: \n\n1 - Área \n2 - Perímetro");
				switch(decisao) {
					case "1":
						base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));
						altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));
						JOptionPane.showMessageDialog(null, "Área da Retângulo: " + r.areaRetangulo(base, altura));
						break;
					case "2":
						base = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da base"));
						altura = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da altura"));
						JOptionPane.showMessageDialog(null, "Perímetro da Retângulo: " + r.perimetroRetangulo(base, altura));
						break;
					default:
						JOptionPane.showMessageDialog(null, "Escolha inválida");
				}
				break;
			case "3":
				wl = false;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Escolha inválida");
				break;
			}
		}
	}

}
