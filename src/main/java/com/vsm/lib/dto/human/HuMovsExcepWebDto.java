package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuMovsExcepWebDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuMovsExcepWebPKDto id;
	private String area;
	private String autorizado;
	private String autorizadoFt;
	private String centro;
	private BigDecimal concepto;
	private BigDecimal contrato;
	private BigDecimal factor;
	private LocalDateTime fecha;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaPago;
	private BigDecimal importe;
	private String linea;
	private BigDecimal nota;
	private BigDecimal numEmp;
	private BigDecimal numLote;
	private BigDecimal numRef;
	private String puesto;
	private String status;
	private BigDecimal turno;
	private BigDecimal vt1;
	private BigDecimal vt2;
	private BigDecimal vt3;
	private BigDecimal vt4;
	private BigDecimal zona;
}