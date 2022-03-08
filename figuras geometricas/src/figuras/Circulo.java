package figuras;

import java.util.Objects;

public class Circulo {
	private double radio;

	@Override
	public String toString() {
	double radio, area, longitud;
	
	
	

	/**
	 * @
	 */

	public Circulo() {
		setRadio(1.0);
	}
		// Constructor de la clase Circulo
		/*
		 * comentarios de bloque
		 */
	}

	@Override
	public int hashCode() {
		return Objects.hash(radio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		return Double.doubleToLongBits(radio) == Double.doubleToLongBits(other.radio);
	}

	public Circulo(double radioInicial) {
		this.radio = radioInicial;

	}
}
