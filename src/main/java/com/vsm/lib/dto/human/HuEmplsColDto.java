package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsColDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsColPKDto id;
	private BigDecimal alivioSalud;
	private BigDecimal alivioVivienda;
	private BigDecimal anticipoCesantia;
	private BigDecimal anticipoIntCesantia;
	private BigDecimal aportePatron;
	private String cajaCompensacion;
	private String cedulaIdentidad;
	private String centroTrab;
	private BigDecimal certificadoSalud;
	private BigDecimal codPais;
	private BigDecimal codigoCt;
	private BigDecimal cosArea;
	private String declarante;
	private String departamento;
	private String email;
	private String embargo;
	private String extranjeroCotiza;
	private LocalDateTime fechaAsigCentroTrab;
	private LocalDateTime fechaEfectivaPension;
	private LocalDateTime fechaEfectivaSalud;
	private LocalDateTime fechaMov;
	private String fondoAportaAfc;
	private String fondoAportaVol;
	private String fondoAtep;
	private String fondoCesantia;
	private String fondoPension;
	private String fondoSalud;
	private String globalAutol;
	private LocalDateTime inicioPension;
	private LocalDateTime liqCesantia;
	private LocalDateTime liqIntCesantia;
	private String municipio;
	private String nombreVia;
	private String nota;
	private String numeroPlaca;
	private String pais;
	private String personalACargo;
	private BigDecimal porcentEmbargo;
	private String porcentPension;
	private BigDecimal porcentRetencion;
	private String prefijoCuadrante;
	private BigDecimal promedioRetencion;
	private String regimenLaboral;
	private String residenteExt;
	private BigDecimal saldoCesantia;
	private String status;
	private BigDecimal subtipoCotizante;
	private BigDecimal telefonoCasa;
	private BigDecimal telefonoCelular;
	private String tipoCotizante;
	private String tipoEmbargo;
	private String tipoId;
	private BigDecimal tipoPension;
	private String tipoRetencion;
	private String tipoSalAutoliquid;
	private String tipoSalario;
	private String tipoVia;
	private String userId;
	private String variacionSueldo;
}