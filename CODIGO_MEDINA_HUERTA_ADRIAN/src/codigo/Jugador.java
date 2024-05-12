package codigo;

import java.util.List;

public class Jugador extends Usuario {

	private boolean suspendido;
	 private List<Entrenador> entrenadoresasignados;
	 
	public Jugador() {
		
	}

	public boolean isSuspendido() {
		return suspendido;
	}

	public void setSuspendido(boolean suspendido) {
		this.suspendido = suspendido;
	}

	public List<Entrenador> getEntrenadoresasignados() {
		return entrenadoresasignados;
	}

	public void setEntrenadoresasignados(List<Entrenador> entrenadoresasignados) {
		this.entrenadoresasignados = entrenadoresasignados;
	}

	
	
 
	
}
