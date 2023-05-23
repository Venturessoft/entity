package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtEstacionDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idEstacion;
	private String bssid;
	private String cveUnidad;
	private String domingoHo;
	private String estacionLibre;
	private String estatus;
	private BigDecimal idZona;
	private String juevesHo;
	private BigDecimal latitud;
	private BigDecimal longitud;
	private String lunesHo;
	private String martesHo;
	private String miercolesHo;
	private String nombre;
	private BigDecimal rango;
	private String sabadoHo;
	private String uuid;
	private String viernesHo;
}