
public class EmpregadoHorista extends Empregado {
	int totalDeHorasTrabalhadas;
	double valorDaHoraTrabalhada;

	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}

	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
	}

	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total de horas trabalhadas " + totalDeHorasTrabalhadas + "\n";
		aux += "Valor da hora R$ " + valorDaHoraTrabalhada + "\n";
		return aux;
	}

}
