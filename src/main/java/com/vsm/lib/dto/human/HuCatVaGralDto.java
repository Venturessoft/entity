package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatVaGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String asignarFechaVencimiento;
	private String bloqVacPer;
	private String calculoFiniquitosCol;
	private String capturarPrimaRhd;
	private BigDecimal diasAutSolicitudVac;
	private BigDecimal diasBlocVa;
	private LocalDateTime fechaMov;
	private String fechaPagoLimitVac;
	private String fechaPagoSecSalida;
	private String marcaDomingo;
	private String marcaSabado;
	private LocalDateTime mesFin;
	private LocalDateTime mesIni;
	private BigDecimal mesesVencimiento;
	private String obligatorioFechaPago;
	private String pagarDiasPeriodo;
	private String pagoAntVac;
	private String pagoPrimaAnual;
	private BigDecimal porcentajeDiasPagados;
	private String selectivoVencimiento;
	private String separarDia31;
	private String solicitudVacPendientes;
	private String status;
	private String topeDiasPeriodo;
	private String topeFechaVencimiento;
	private String userId;
	private BigDecimal vaDiasFinde;
	private BigDecimal vaDiasHabiles;
	private BigDecimal vaDiasNatSolicitud1;
	private BigDecimal vaDiasNatSolicitud2;
	private BigDecimal vaDiasNaturales;
	private String vacDesc;
	private String vacEsp;
	private String valDiasPendientes;
	private String valDiasRecientes;
	private String validarContinuidad;
	private String validarDiasPagados;
	private String visiblePrimaVac;
}