package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico{
	private Double profundidadActual = 0.0;
	private String modeloDelDestructor;

	public Destructor(Integer codigoIdentificador, String modeloDelDestructor) {
		super(codigoIdentificador);
		this.modeloDelDestructor = modeloDelDestructor;
	}

	@Override
	public Double getProfundidad() {
		return profundidadActual;
	}
	
}
