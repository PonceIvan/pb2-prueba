package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {
	private String modeloDelTanque;
	private Double velocidadActual = 0.0;

	public Tanque(Integer codigoIdentificador, String modeloDelTanque) {
		super(codigoIdentificador);
		this.modeloDelTanque = modeloDelTanque;
	}

	@Override
	public Double getVelocidad() {
		return velocidadActual;
	}

}
