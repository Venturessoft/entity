package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MvDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private MvPKDto id;
	private String mvdArea;
	private String mvdCentro;
	private BigDecimal mvdConcepto;
	private BigDecimal mvdContrato;
	private BigDecimal mvdFactor;
	private BigDecimal mvdFecha;
	private LocalDateTime mvdFechaCap;
	private String mvdGralXCpto;
	private LocalDateTime mvdHoraCap;
	private BigDecimal mvdImporte;
	private String mvdLinea;
	private String mvdMotivoAut;
	private BigDecimal mvdNota;
	private BigDecimal mvdNumEmp;
	private BigDecimal mvdProcesoApli;
	private String mvdPuesto;
	private String mvdSts;
	private BigDecimal mvdTurno;
	private String mvdUsuario;
	private BigDecimal mvdVt1;
	private BigDecimal mvdVt2;
	private BigDecimal mvdVt3;
	private BigDecimal mvdVt4;
	private BigDecimal mvdZona;
}