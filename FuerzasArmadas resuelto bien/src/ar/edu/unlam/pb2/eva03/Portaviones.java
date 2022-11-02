package ar.edu.unlam.pb2.eva03;

public class Portaviones extends Vehiculo implements Acuatico {
	private Double profundidadActual = 0.0;
	private String modeloDelPortaAvion;

	public Portaviones(Integer codigoIdentificador, String modeloDelPortaAvion) {
		super(codigoIdentificador);
		this.modeloDelPortaAvion =  modeloDelPortaAvion;
	}

	@Override
	public Double getProfundidad() {
		return profundidadActual;
	}

}
