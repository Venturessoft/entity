package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuRequisicionDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuRequisicionPKDto id;
	private String area;
	private String areaActual;
	private String areaDestino;
	private String atConsecCont;
	private String autorizada;
	private BigDecimal cantidadContratada;
	private BigDecimal cantidadSolicitada;
	private String centro;
	private String centroActual;
	private String centroDestino;
	private String clavePuesto;
	private String claveStatusReq;
	private String claveTipoContrato;
	private String claveZona;
	private String codId01;
	private String codId02;
	private String consecutivo;
	private String controlRequisicion;
	private BigDecimal duracion;
	private LocalDateTime fechaBajaPropReemp;
	private LocalDateTime fechaCierre;
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaMovOrg;
	private LocalDateTime fechaReqAut;
	private LocalDateTime fechaReqCubierta;
	private LocalDateTime fechaReqLimite;
	private LocalDateTime fechaRequisicion;
	private LocalDateTime fechaStatusReq;
	private String formatoSueldoActual;
	private String formatoSueldoNuevo;
	private String grupoPrestacion;
	private String justificacion;
	private String justificacionMov;
	private String linea;
	private String lineaActual;
	private String lineaDestino;
	private String monedaActual;
	private String monedaNueva;
	private String motivoFinPublic;
	private String motivoRequisicion;
	private String movOrg;
	private BigDecimal numCiaActual;
	private BigDecimal numCiaDestino;
	private BigDecimal numCiaJefeInmed;
	private BigDecimal numCiaPuesto;
	private BigDecimal numCiaReclutador;
	private BigDecimal numCiaSolicitante;
	private BigDecimal numEmp;
	private BigDecimal numEmpJefeInmed;
	private BigDecimal numEmpReclutador;
	private BigDecimal numEmpSolicitante;
	private BigDecimal numFlujo;
	private BigDecimal numeroFormato;
	private String pandora;
	private BigDecimal plazaActual;
	private BigDecimal plazaDestino;
	private String plazasAsignadas;
	private String publicable;
	private String puestoActual;
	private String puestoDestino;
	private String reemplazaA;
	private String status;
	private BigDecimal sueldoActual;
	private BigDecimal sueldoMaximo;
	private BigDecimal sueldoMinimo;
	private BigDecimal sueldoNuevo;
	private BigDecimal tiempoCobVacantes;
	private String tipoDuracion;
	private String tipoMovOrg;
	private BigDecimal turno;
	private String userId;
	private String userReq;
	private String viajar;
	private BigDecimal zona;
	private BigDecimal zonaActual;
	private BigDecimal zonaDestino;
}