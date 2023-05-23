package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatRsGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String asociarNuevasPlazas;
	private String avisoCorreoSolWeb;
	private String candUnaReq;
	private String competPorPerfil;
	private String correoAsunto;
	private String correoAut;
	private String correoCtaSaliente;
	private String correoDatAsunto;
	private String correoDatCtaEnt;
	private String correoDatosCand;
	private String correoMensaje;
	private String correoPwd;
	private String correoSmtpHost;
	private String emailBt;
	private String entrevRango;
	private String entrevVisible;
	private String entrevWtd;
	private String evaluatestAccessKey;
	private String evaluatestContrasena;
	private String evaluatestPrefijo;
	private String evaluatestRecuperaEval;
	private String evaluatestTipoAutenticacion;
	private String evaluatestToken;
	private String evaluatestTokenEsquema;
	private LocalDateTime evaluatestTokenVence;
	private String evaluatestUsuario;
	private String examRango;
	private String examVisible;
	private String examWtd;
	private LocalDateTime fechaMov;
	private String finReqCierre;
	private BigDecimal formatoWeb;
	private BigDecimal minReservados;
	private String modificarSueldoMax;
	private BigDecimal numCiaAsocia;
	private BigDecimal numCiaFormato;
	private BigDecimal numCiaModifica;
	private String occContrasena;
	private String occPublicable;
	private String occUsuario;
	private BigDecimal plazaAsocia;
	private BigDecimal plazaModifica;
	private BigDecimal puerto;
	private String puestoAsocia;
	private String puestoModifica;
	private String pyxoomContrasena;
	private String pyxoomEndpoint;
	private String pyxoomRecuperaEval;
	private String pyxoomToken;
	private LocalDateTime pyxoomTokenVence;
	private String pyxoomUsuario;
	private String quartilSueldoMax;
	private String quartilSueldoMin;
	private BigDecimal requisicionWeb;
	private String reqxcRango;
	private String reqxcVisible;
	private String solbtRango;
	private String solbtVisible;
	private String solbtWtd;
	private String solcRango;
	private String solcVisible;
	private String solcWtd;
	private String ssl;
	private String status;
	private BigDecimal tempLigasBt;
	private String tls;
	private String userId;
}