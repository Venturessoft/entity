package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatCoGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String anioPresupRef;
	private String asociarContratoPlaza;
	private String bancaCentralizada;
	private String calcIntegrados;
	private String ciXPuesto;
	private BigDecimal compPtoMax;
	private BigDecimal compPtoMin;
	private String ctrlPlazasIndep;
	private BigDecimal diasAltaAnt;
	private BigDecimal diasAltaDes;
	private BigDecimal diasBajaAnt;
	private BigDecimal diasBajaDes;
	private BigDecimal diasRetroactivos;
	private String digVer;
	private String emplsGrupo;
	private String escalaCalifComp;
	private String evaluacion;
	private String fechaMerito;
	private LocalDateTime fechaMov;
	private String licencias;
	private String limpiarReingreso;
	private String mapaCaracteres;
	private BigDecimal mesFinPresup;
	private BigDecimal mesIniPresup;
	private String metodoValuacion;
	private String modifFoto;
	private String modificarNumEmp;
	private String multiplesContratos;
	private BigDecimal numCiaVer;
	private BigDecimal organigFactorSueldo;
	private String pais;
	private String periodicidadContratos;
	private String periodicidadFiniquitos;
	private String reingresoSinFiniquito;
	private String retroactivo;
	private String status;
	private String subcontratacion;
	private String userId;
	private String valCtaBanco;
	private String valEmpCurp;
	private String valEmpNumImss;
	private String valEmpRfc;
	private String valTabulador;
	private String validarNivelDepto;
	private String validarNivelDeptoComp;
	private String visibleContratos;
	private String visibleFiniquitos;
}