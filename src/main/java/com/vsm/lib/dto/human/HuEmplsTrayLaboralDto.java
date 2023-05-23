package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsTrayLaboralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsTrayLaboralPKDto id;
	private String area;
	private String cambioDepto;
	private String cambioPuesto;
	private String cambioSueldo;
	private String cambioZona;
	private String centro;
	private LocalDateTime fechaMov;
	private String formatoSueldo;
	private String linea;
	private String moneda;
	private String motivo;
	private BigDecimal numCiaPuesto;
	private BigDecimal plaza;
	private String puesto;
	private String status;
	private BigDecimal sueldo;
	private String tipoSust;
	private String userId;
	private BigDecimal zona;
}