import java.util.ArrayList;

public class Controle {

	private ArrayList<Empregado> listaEmpregado = new ArrayList<>();

	public void inserir(Empregado empregado) {
		listaEmpregado.add(empregado);
	}

	public Empregado pesquisar(long matricula) {
		Empregado aux = null;
		for (Empregado e : listaEmpregado) {
			if (e.matricula == matricula) {
				aux = e;
			}
		}
		return aux;
	}

	public String listar() {
		String auxHorista = "Empregado Horista\n";
		String auxComissionado = "Empregado Comissionado\n";

		for (Empregado e : listaEmpregado) {
			if (e instanceof EmpregadoHorista) {
				auxHorista += e + "\n";
			} else {
				auxComissionado += e + "\n";
			}

		}
		return auxHorista + auxComissionado;
	}

}
