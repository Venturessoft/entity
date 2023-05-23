package com.vsm.lib.dto.seldb; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VProcesoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private BigDecimal ta010Anio;
	private BigDecimal ta010Cia;
	private BigDecimal ta010Modulo;
	private BigDecimal ta010NumPer;
	private BigDecimal ta010Proceso;
	private String ta020Descr;
	private String ta040FecFin;
	private String ta040FecIni;
}