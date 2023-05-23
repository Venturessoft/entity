package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta040Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta040PKDto id;
	private BigDecimal ta040AnioCt;
	private String ta040Cfdi;
	private BigDecimal ta040ClaveCfdi;
	private BigDecimal ta040Col1;
	private BigDecimal ta040Col2;
	private BigDecimal ta040Col3;
	private BigDecimal ta040Col4;
	private BigDecimal ta040Col5;
	private BigDecimal ta040ConcNoop1;
	private BigDecimal ta040ConcNoop2;
	private BigDecimal ta040ConcNoop3;
	private BigDecimal ta040ConcNoop4;
	private BigDecimal ta040ConcNoop5;
	private BigDecimal ta040ConcNoop6;
	private BigDecimal ta040ConcNoop7;
	private BigDecimal ta040ConcNoop8;
	private String ta040Descripcion;
	private LocalDateTime ta040FecCie;
	private LocalDateTime ta040FecCieAviso;
	private LocalDateTime ta040FecCieReal;
	private LocalDateTime ta040FecCon;
	private LocalDateTime ta040FecConAviso;
	private LocalDateTime ta040FecConReal;
	private LocalDateTime ta040FecCorteAltas;
	private LocalDateTime ta040FecCorteIncidRhd;
	private LocalDateTime ta040FecCorteIncidencia;
	private LocalDateTime ta040FecEjecCalculo;
	private LocalDateTime ta040FecEjecCierre;
	private LocalDateTime ta040FecFin;
	private LocalDateTime ta040FecGen;
	private LocalDateTime ta040FecGenAviso;
	private LocalDateTime ta040FecGenReal;
	private LocalDateTime ta040FecInc;
	private LocalDateTime ta040FecIncAviso;
	private LocalDateTime ta040FecIncReal;
	private LocalDateTime ta040FecIni;
	private LocalDateTime ta040FecNom;
	private LocalDateTime ta040FecNomAviso;
	private LocalDateTime ta040FecNomReal;
	private LocalDateTime ta040FecPago;
	private LocalDateTime ta040FecPagoLimitVac;
	private LocalDateTime ta040FecPagoPrima;
	private LocalDateTime ta040FecPreTe;
	private LocalDateTime ta040FecRev;
	private BigDecimal ta040MesCont;
	private BigDecimal ta040NumPerCt;
	private BigDecimal ta040NumSem;
	private BigDecimal ta040Periodo;
	private BigDecimal ta040ProcesoCt;
	private String ta040StatusCie;
	private String ta040StatusCon;
	private String ta040StatusGen;
	private String ta040StatusInc;
	private String ta040StatusNom;
	private String ta040Sts;
}