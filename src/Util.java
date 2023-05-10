
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static java.lang.Long.parseLong;;


public class Util {

	private Controle controle = new Controle();
	
	public void menu() {
		
		int opcao = 0;
		
		do {
			try {
				opcao = parseInt(showInputDialog(gerarMenu()));
				if(opcao < 1 || opcao > 5) {
					showMessageDialog(null, "Opcao inválida");
				}else {
					switch(opcao) {
					case 1:
					case 2:
						cadastrar(opcao);
						break;
					case 3:
						pesquisar();
						break;
					case 4:
						listar();
						break;
					}
				}
			}
			catch(NumberFormatException e) {
				showMessageDialog(null, "Você deve digitar um número\n" + e);
			}
		} while(opcao != 5);
		
	}
	
	private void listar() {
		showMessageDialog(null, controle.listar());	
		}

	private void pesquisar() {
		long matricula;
		matricula = parseLong(showInputDialog("Matricula"));
		showMessageDialog(null, controle.pesquisar(matricula));
	}

	private void cadastrar(int opcao) {
		String nome;
		long matricula;
		double totalDeVendas, comissao, valorDaHora;
		int totalDeHoras;
		
		nome = showInputDialog("Nome");
		matricula = parseLong(showInputDialog("Matricula"));
		
		
		if(opcao == 1) {
			totalDeHoras = parseInt(showInputDialog("Total de horas trabalhadas"));
			valorDaHora = parseDouble(showInputDialog("Valor da hora trabalhada"));
			controle.inserir(new EmpregadoHorista(matricula, nome, totalDeHoras, valorDaHora));
		}else {
			totalDeVendas = parseDouble(showInputDialog("Total de Vendas"));
			comissao = parseDouble(showInputDialog("Comissão"));
			controle.inserir(new EmpregadoComissionado(matricula, nome, totalDeVendas, comissao));
		}
		
	}

	private String gerarMenu() {
		String aux = "";
		aux += "1. Cadastrar empregado horista\n";
		aux += "2. Cadastrar empregado comissionado\n";
		aux += "3. Pesquisar\n";
		aux += "4. Listar\n";
		aux += "5. Finalizar\n";
		return aux;
	}
	
}
