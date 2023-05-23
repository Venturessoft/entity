package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsExpLaboralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsExpLaboralPKDto id;
	private BigDecimal anio;
	private BigDecimal clavePaisTel;
	private BigDecimal codAreaTel;
	private BigDecimal codPos;
	private String colonia;
	private String contabilizaAntiguedad;
	private String domicilio;
	private String estado;
	private LocalDateTime fechaFinal;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaMov;
	private String giroEmp;
	private String jefPuesto;
	private String jefeNombre;
	private String motivoSep;
	private String nomCia;
	private String nombreCont;
	private BigDecimal opCreditoSalario;
	private BigDecimal opImpuestoRetenido;
	private BigDecimal opIngresos;
	private BigDecimal opIngresosExentos;
	private String opRfc;
	private BigDecimal opSubsidioAcreditable;
	private BigDecimal opSubsidioNoAcreditable;
	private String poblacion;
	private String principalesFuncionesPuesto;
	private String principalesFuncionesPuestoii;
	private String puesto;
	private String status;
	private BigDecimal sueldo;
	private BigDecimal sueldoCompensado;
	private BigDecimal telefono;
	private String telefonoCont;
	private String tipoGobierno;
	private String tipoSector;
	private String tipoServicio;
	private String userId;
}