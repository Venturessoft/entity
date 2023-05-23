package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RtDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private RtPKDto id;
	private String rtArea;
	private String rtAutCCosto;
	private String rtCategoria;
	private String rtCentro;
	private LocalDateTime rtFecCapt;
	private LocalDateTime rtHorCapt;
	private LocalDateTime rtHoraSal;
	private String rtLinea;
	private String rtSts;
	private String rtUsuario;
	private BigDecimal rtZona;
}