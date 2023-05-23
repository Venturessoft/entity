package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatBsGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String autorizacionDeposito;
	private String campoAusentismo;
	private String campoPrestamo;
	private String claveConfirmacionCfdi;
	private String claveLlave;
	private String cveMonNac;
	private String deptoVigente;
	private String descrAlternaConcep;
	private String descripcionAlterCptosSat;
	private String descripcionConceptosSat;
	private BigDecimal diasProgPago;
	private String dwFinliq;
	private BigDecimal edadFinEps;
	private BigDecimal edadIniEps;
	private String factInt;
	private LocalDateTime fechaDescripcionSat;
	private LocalDateTime fechaMov;
	private String finiquitosActivos;
	private BigDecimal gpoAusentismo;
	private BigDecimal gpoDeducNo;
	private BigDecimal gpoPolizaPro;
	private BigDecimal gpoPolizaPro2;
	private BigDecimal grupoEps;
	private BigDecimal grupoExento;
	private BigDecimal grupoGravado;
	private BigDecimal grupoNoAcumKiosco;
	private String incapacidadesGob;
	private String leyendaRecibo;
	private BigDecimal matrizEps;
	private BigDecimal mesesHist;
	private BigDecimal numPrestamosVig;
	private String pagoDiasFebrero;
	private String pathPblFinliq;
	private String polizaPro;
	private String polizaReg;
	private String polizasPropor;
	private BigDecimal porcentajeCol;
	private String reciboKiosco;
	private String reversionAusentismo;
	private String rutaArchSql;
	private String rutaCertificado;
	private String status;
	private String tipoCalVt3;
	private String tipoCalVt4;
	private String tipoDistribucionConta;
	private String userId;
	private String validarNivelDepto;
	private BigDecimal versionCalculo;
	private BigDecimal versionCfdi;
	private String zonaEstructuraDepartamental;
}