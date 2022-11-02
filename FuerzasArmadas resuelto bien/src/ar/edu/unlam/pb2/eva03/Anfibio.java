package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {
	private Double profundidadActual = 0.0;
	private Double velocidadActual = 0.0;
	private String modeloDelAnfibio;

	public Anfibio(Integer codigoIdentificador, String modeloDelAnfibio) {
		super(codigoIdentificador);
		this.modeloDelAnfibio = modeloDelAnfibio;
	}

	@Override
	public Double getProfundidad() {
		return profundidadActual;
	}

	@Override
	public Double getVelocidad() {
		return velocidadActual;
	}

}
