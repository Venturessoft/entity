package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsAcumPerDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsAcumPerPKDto id;
	private String claveLocalidad;
	private String claveProvincia;
	private BigDecimal claveSat;
	private String formaPago;
	private String gravadoExentoSat;
	private BigDecimal importe;
	private String lugarPago;
	private BigDecimal mes;
	private String moneda;
	private String motivoAut;
	private BigDecimal numSem;
	private BigDecimal propiedadSat;
	private BigDecimal turno;
	private BigDecimal vt1;
	private BigDecimal vt2;
	private BigDecimal vt3;
	private BigDecimal vt4;
}