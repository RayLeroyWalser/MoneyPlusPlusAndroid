package model;

public class GastoPeriodicoFecha extends GastoPeriodico {

	private String[] fechas;
	private String frecuencia;

	public GastoPeriodicoFecha(double monto, String descripcion, String tipo, String[] fechas,
			String frecuencia) {
		super(monto, descripcion, tipo);
		this.fechas = fechas;
		this.frecuencia = frecuencia;
	}

	public String[] getFechas() {
		return fechas;
	}

	public void setFechas(String[] fechas) {
		this.fechas = fechas;
	}

	public String getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}

}
