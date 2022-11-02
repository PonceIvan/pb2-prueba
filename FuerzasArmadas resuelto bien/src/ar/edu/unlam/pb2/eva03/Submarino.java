package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {
	private String modeloDelSubmarino;
	private Double profundidadActual = 0.0;

	public Submarino(Integer codigoIdentificador, String modeloDelSubmarino) {
		super(codigoIdentificador);
		this.modeloDelSubmarino = modeloDelSubmarino;
	}

	@Override
	public Double getProfundidad() {
		return profundidadActual;
	}

}
