package ar.edu.unlam.pb2.eva03;

public class HidroAvion extends Vehiculo implements Acuatico, Volador {
	private Double alturaActual = 0.0;
	private Double profundidadActual = 0.0;
	private String modeloDelHidroAvion;
	
	public HidroAvion(Integer codigoIdentificador, String modeloDelHidroAvion) {
		super(codigoIdentificador);
		this.modeloDelHidroAvion = modeloDelHidroAvion;
	}

	@Override
	public Double getAltura() {
		return alturaActual;
	}

	@Override
	public Double getProfundidad() {
		return profundidadActual;
	}

}
