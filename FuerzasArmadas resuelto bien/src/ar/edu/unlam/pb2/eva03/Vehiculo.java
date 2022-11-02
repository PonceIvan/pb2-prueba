package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public class Vehiculo {
	private Integer codigoIdentificador;
	
	public Vehiculo (Integer codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoIdentificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		/*if (getClass() != obj.getClass())
			return false;*/
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigoIdentificador, other.codigoIdentificador);
	}

	public Integer getCodigoIdentificador() {
		return codigoIdentificador;
	}

	public void setCodigoIdentificador(Integer codigoIdentificador) {
		this.codigoIdentificador = codigoIdentificador;
	}

	
}
