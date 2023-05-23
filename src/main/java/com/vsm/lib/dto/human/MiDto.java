package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MiDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private MiPKDto id;
	private String miArea;
	private String miCentro;
	private String miClaveError;
	private BigDecimal miCptoFijo;
	private BigDecimal miDiasAguinaldo;
	private BigDecimal miDiasCot;
	private BigDecimal miDiasVacacion;
	private BigDecimal miDiasVar;
	private BigDecimal miFactorInteg;
	private LocalDateTime miFecImss;
	private LocalDateTime miFechaMod;
	private LocalDateTime miFechaStsEdi;
	private BigDecimal miGpoCot;
	private LocalDateTime miHoraMod;
	private String miHuellaDigital;
	private String miLinea;
	private String miOrigen;
	private BigDecimal miPesosVar;
	private BigDecimal miProcenPrimaVacacion;
	private String miReferenciaImss;
	private BigDecimal miSalBase;
	private BigDecimal miSalInt;
	private BigDecimal miSalMin;
	private BigDecimal miSdiEym;
	private BigDecimal miSdiIfvt;
	private BigDecimal miSdiIvc;
	private BigDecimal miSdiSar;
	private String miSelloDigital;
	private BigDecimal miSemanaRedImss;
	private String miSts;
	private String miStsEdi;
	private String miTipoCal;
	private String miTipoTrabajadorImss;
	private String miUsuario;
	private BigDecimal miYearAntig;
	private BigDecimal miZona;
	private BigDecimal numRefHuman;
	private String stsRefer;
}