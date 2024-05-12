package codigo;

import java.sql.Date;
import java.util.List;

public class SesionEntrenamiento {

	private Date fechaHora;
    private int participantesBuscados;
    private String ubicacion;
    private String titulo;
    private String descripcion;
    private int duracion;
    private double costo;
    private List<Jugador> jugadoresInscritos;
    
	public SesionEntrenamiento() {
		
	}

	   // Getters y setters
	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getParticipantesBuscados() {
		return participantesBuscados;
	}

	public void setParticipantesBuscados(int participantesBuscados) {
		this.participantesBuscados = participantesBuscados;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public List<Jugador> getJugadoresInscritos() {
		return jugadoresInscritos;
	}

	public void setJugadoresInscritos(List<Jugador> jugadoresInscritos) {
		this.jugadoresInscritos = jugadoresInscritos;
	}
    

}
