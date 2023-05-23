package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuFlujosTrabajoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuFlujosTrabajoPKDto id;
	private String admonTareas;
	private String archivo;
	private String autorizacion;
	private String autorizadores;
	private String banco;
	private String caracteristicas;
	private String certificadoSeguridad;
	private String clasifPuesto;
	private String claveActividad;
	private String condClave;
	private String condDesc;
	private String condUsr;
	private String condWhere;
	private String cuentaCorreo;
	private String direccionFtp;
	private String direccionIp;
	private String email;
	private String estructMat;
	private String evalProm;
	private String excepcionClave;
	private String excepcionDesc;
	private String excepcionUsr;
	private String excepcionWhere;
	private LocalDateTime fechaMov;
	private String modifSueldo;
	private String modoEscritura;
	private String multiplesEmpls;
	private BigDecimal numCiaDest;
	private BigDecimal numEmp;
	private BigDecimal orden;
	private BigDecimal ordenBusqueda;
	private String orgVig;
	private String password;
	private BigDecimal plaza;
	private BigDecimal proceso;
	private BigDecimal publicacion;
	private BigDecimal puerto;
	private String puesto;
	private String reclutador;
	private String ruta;
	private String segXCc;
	private String simultaneo;
	private String solicitante;
	private String status;
	private String sucursal;
	private String supervDirecta;
	private String tipoEmpl;
	private String tipoEnvio;
	private String userId;
	private String usuario;
	private BigDecimal venceTarea;
	private BigDecimal vigencia;
	private BigDecimal zona;
}