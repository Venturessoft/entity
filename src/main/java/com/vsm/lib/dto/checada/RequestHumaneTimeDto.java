package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Arrays;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RequestHumaneTimeDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private int numCia;
	private long numEmp;
	private LocalDateTime fechaChecada;
	private String tipoChecada;
	private String foto;
	private int prioridad;

	private String beacon[];
	private sGeolocalizacion geolocalizacion;

	@Override
	public String toString() {
		return "RequestHumaneTime [numCia=" + numCia + ", numEmp=" + numEmp + ", fechaChecada=" + fechaChecada +
			   ", tipoChecada=" + tipoChecada + ", foto=" + foto + ", beacon=" + Arrays.toString(beacon) +
			   ", geolocalizacion=" + geolocalizacion + "]";
	}

	public class sGeolocalizacion {
		private double latitud;
		private double longitud;

		public double getLatitud() {
			return latitud;
		}

		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}

		public double getLongitud(){
			return longitud;
		}

		public void setLongitud(double longitud) {
			this.longitud = longitud;
		}

		@Override
		public String toString() {
			return "sGeolocalizacion [latitud=" + latitud + ", longitud=" + longitud + "]";
		}

	}
}