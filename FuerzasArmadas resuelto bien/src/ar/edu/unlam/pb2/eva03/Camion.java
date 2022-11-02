package ar.edu.unlam.pb2.eva03;

public class Camion extends Vehiculo implements Terrestre {
	private Double velocidadActual = 0.0;
	private String modeloDelCamion;

	public Camion(Integer codigoIdentificador, String modeloDelCamion) {
		super(codigoIdentificador);
		this.modeloDelCamion = modeloDelCamion;
	}

	@Override
	public Double getVelocidad() {
		return velocidadActual;
	}

}
