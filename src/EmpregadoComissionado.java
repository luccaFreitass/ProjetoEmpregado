
public class EmpregadoComissionado extends Empregado {
	double totalDeVendas;
	double comissao;
	
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}
	
	public double calcularSalario() {
		return totalDeVendas * comissao / 100;
	}
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total de vendas R$ " + totalDeVendas + "\n";
		aux += "Comissão " + comissao + "\n";
		return aux;
	}
	
}
