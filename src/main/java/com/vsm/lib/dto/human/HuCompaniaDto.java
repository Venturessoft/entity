package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCompaniaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numeroCompania;
	private String administracionTiempos;
	private String capturaDescansos;
	private String cargaFoto;
	private BigDecimal cia01Consolidar;
	private BigDecimal cia02Consolidar;
	private BigDecimal cia03Consolidar;
	private BigDecimal cia04Consolidar;
	private BigDecimal cia05Consolidar;
	private BigDecimal cia06Consolidar;
	private BigDecimal cia07Consolidar;
	private BigDecimal cia08Consolidar;
	private BigDecimal cia09Consolidar;
	private BigDecimal cia10Consolidar;
	private BigDecimal cia11Consolidar;
	private BigDecimal cia12Consolidar;
	private BigDecimal cia13Consolidar;
	private BigDecimal cia14Consolidar;
	private BigDecimal cia15Consolidar;
	private BigDecimal cia16Consolidar;
	private BigDecimal cia17Consolidar;
	private BigDecimal cia18Consolidar;
	private BigDecimal cia19Consolidar;
	private BigDecimal cia20Consolidar;
	private String claveCompania;
	private String claveFiel;
	private BigDecimal claveFl;
	private String claveLlave;
	private String companiaGobierno;
	private String controlDe;
	private String controlEstacion;
	private String controlHeadcount;
	private String descr1;
	private String descr2;
	private String descr3;
	private String descr4;
	private String descr5;
	private String descr6;
	private BigDecimal diasAnterioresAus;
	private BigDecimal diasAnterioresInc;
	private BigDecimal diasAnterioresVac;
	private BigDecimal digitoVFinal;
	private BigDecimal digitoVInicial;
	private LocalDateTime fechaMov;
	private BigDecimal matrizTope;
	private BigDecimal maximoRetardos;
	private BigDecimal nivel1;
	private BigDecimal nivel2;
	private BigDecimal nivel3;
	private BigDecimal nivel4;
	private BigDecimal nivel5;
	private BigDecimal nivel6;
	private BigDecimal numCliente;
	private BigDecimal numEmp;
	private String passwordCompania;
	private String pathCertificado;
	private String pathCertificadoFiel;
	private String pathFiel;
	private String pathLlave;
	private String pathLogo;
	private String primaControlAsist;
	private String razonSocial;
	private String seguridadNip;
	private String siglasCliente;
	private String status;
	private String userId;
}