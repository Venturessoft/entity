package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatRhdGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String borrarChecadas;
	private String email;
	private LocalDateTime fechaMov;
	private String generaAviso;
	private BigDecimal gpoHrsDescanso;
	private BigDecimal gpoHrsExtra;
	private BigDecimal gpoHrsFestivo;
	private BigDecimal gpoHrsRetardo;
	private BigDecimal gpoHrsSalAnticip;
	private BigDecimal gpoHrsTrab;
	private BigDecimal gpoMovsExcepWeb;
	private BigDecimal gpoNomAusentismo;
	private BigDecimal gpoNomIncidencias;
	private BigDecimal gpoUnidadTiempo;
	private String habDiasPago;
	private String insertarChecadas;
	private String repSoa;
	private String reversionFaltas;
	private String status;
	private String unidadTiempo;
	private String userId;
}