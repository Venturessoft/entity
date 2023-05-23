package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RvDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private RvPKDto id;
	private String rvArea;
	private String rvAutNomina;
	private String rvAutSupv;
	private String rvCategoria;
	private String rvCentro;
	private BigDecimal rvFactor;
	private LocalDateTime rvFechaAutNomina;
	private LocalDateTime rvFechaAutSupv;
	private LocalDateTime rvFechaMov;
	private BigDecimal rvImporte;
	private String rvLinea;
	private String rvMotivoAut;
	private String rvSts;
	private String rvStsInterfase;
	private String rvStsKardex;
	private String rvStsReg;
	private BigDecimal rvTurno;
	private String rvUserId;
	private String rvUsuarioNomina;
	private String rvUsuarioSupv;
	private BigDecimal rvVt1;
	private BigDecimal rvVt1Ori;
	private BigDecimal rvVt2;
	private BigDecimal rvVt2Ori;
	private BigDecimal rvVt3;
	private BigDecimal rvVt3Ori;
	private BigDecimal rvVt4;
	private BigDecimal rvVt4Ori;
	private BigDecimal rvZona;
}