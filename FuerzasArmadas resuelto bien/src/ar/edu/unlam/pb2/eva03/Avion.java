package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador  {
	private String modeloDelAvion;
	private Double alturaDeVuelo = 0.0;

	public Avion(Integer codigoIdentificador, String modeloDelAvion) {
		super(codigoIdentificador);
		this.modeloDelAvion = modeloDelAvion;
	}

	@Override
	public Double getAltura() {
		return alturaDeVuelo;
	}
	
	

	

}
