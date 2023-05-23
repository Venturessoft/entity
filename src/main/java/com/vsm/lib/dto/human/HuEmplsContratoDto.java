package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsContratoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsContratoPKDto id;
	private String causaBaja;
	private String causaBajaReal;
	private LocalDateTime fechaBaja;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaTerminacion;
	private String grupoPrestacion;
	private String observaciones;
	private String status;
	private String tipoContrato;
	private String tipoEmpl;
	private String userId;
	private BigDecimal vigencia;
}