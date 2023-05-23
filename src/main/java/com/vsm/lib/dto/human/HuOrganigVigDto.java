package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuOrganigVigDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuOrganigVigPKDto id;
	private String area;
	private String centro;
	private String claveDelPuestoSuperior;
	private String claveTabulador;
	private String codId26;
	private String codId27;
	private String codId28;
	private String descripcion;
	private LocalDateTime fechaAplicacion;
	private LocalDateTime fechaCancelacion;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaMovSust;
	private LocalDateTime fechaMovTit;
	private LocalDateTime fechaTerminacion;
	private String grupoPrestacion;
	private BigDecimal jornada;
	private String linea;
	private String motivoCancelacion;
	private BigDecimal nip;
	private BigDecimal nivel;
	private BigDecimal numCiaAut;
	private BigDecimal numCiaSuperior;
	private BigDecimal numEmp;
	private BigDecimal numEmpAut;
	private BigDecimal numEmpMovSust;
	private BigDecimal numEmpMovTit;
	private BigDecimal numEmpSust;
	private BigDecimal plazaSuperior;
	private String status;
	private String tipoContrato;
	private String tipoEmpl;
	private String tipoMovSust;
	private String tipoMovTit;
	private String tipoPlaza;
	private String tipoSust;
	private String userId;
	private BigDecimal zona;
}