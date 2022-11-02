package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
 

public class FuerzaArmada {

	private Set<Vehiculo> convoy = new HashSet();
	private Set<Vehiculo> convoyListoParaLaBatalla = new HashSet();
	private Map<String, Batalla> batallas = new HashMap();
	
	public void agregarVehiculo(Vehiculo vehiculoAIncluir) {
		convoy.add(vehiculoAIncluir);
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}

	public void asignarBatalla(Batalla batallaAAsignar) {
		batallas.put(batallaAAsignar.getNombreDeLaBatalla(), batallaAAsignar);
	}

	public Integer getCantidadDeBatallas() {
		return batallas.size();
	}

	public void presentarBatalla(Batalla batallaACombatir) {
		TipoDeBatalla tipoDeLaBatallaACombatir = batallaACombatir.getTipo();
		
		for (Vehiculo vehiculo : convoy) {
			switch (tipoDeLaBatallaACombatir) {
			case TERRESTRE:
				if(vehiculo instanceof Terrestre ) {
					convoyListoParaLaBatalla.add(vehiculo);
				}
				break;
			case ACUATICA:
				if(vehiculo instanceof Acuatico ) {
					convoyListoParaLaBatalla.add(vehiculo);
				}
				break;
			case AEREA:
				if(vehiculo instanceof Volador ) {
					convoyListoParaLaBatalla.add(vehiculo);
				}
				break;
			}
		}
	}

	public Integer cantidadDeConvoyParaLaBatalla() {
		return convoyListoParaLaBatalla.size();
	}

	public boolean enviarALaBatalla(Batalla batalla, Integer codigoVehiculo) throws VehiculoIncompatible, VehiculoInexistente {
		TipoDeBatalla estiloDeBatalla = batalla.getTipo();
		for (Vehiculo vehiculo : convoy) {
			if(vehiculo.getCodigoIdentificador() == codigoVehiculo) {
				switch (estiloDeBatalla) {
				case TERRESTRE:
					if(vehiculo instanceof Terrestre ) {
						return true;
					} else {
						throw new VehiculoIncompatible();
					}
				case ACUATICA:
					if(vehiculo instanceof Acuatico ) {
						return true;
					} else {
						throw new VehiculoIncompatible();
					}
	
				case AEREA:
					if(vehiculo instanceof Volador ) {
						return true;
					}
					else {
						throw new VehiculoIncompatible();
					}
				}
			}
		}
		  throw new VehiculoInexistente();
	}

	public Set<Vehiculo> getVehiculos() {
		return convoy;
	}

}
