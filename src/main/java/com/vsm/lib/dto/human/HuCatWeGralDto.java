package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatWeGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String aplicaFiel;
	private String aplicaReplicaChatCorp;
	private String aplicaSuplenteSolicitud;
	private String atVisible;
	private String bloqEliminacionSolicitudes;
	private String bloquearSolVacDiaActual;
	private String bloquearSolVacFechaActual;
	private String constanciaSueldosSalarios;
	private BigDecimal diasAutSolVoluntarioTe;
	private BigDecimal diasBaja;
	private String diasConcepto;
	private BigDecimal diasNotifSolicitudes;
	private BigDecimal diasSolVoluntarioTe;
	private BigDecimal diasTopePagoPrima;
	private String empleadosBaja;
	private String enviaRecibosMail;
	private LocalDateTime fechaApliCan;
	private LocalDateTime fechaApliCanCfdi;
	private LocalDateTime fechaAplicaFiel;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaReciboCan;
	private String formatoMovImss;
	private String grupoAusentismos;
	private String idCiaFiel;
	private BigDecimal idDomainCiaFiel;
	private String imprimeBolVacaciones;
	private String imprimeConsAus;
	private String imprimeConsVac;
	private BigDecimal intentosFallidos;
	private String leyendaCorreoFiel;
	private String leyendaCorreoSuplSolicitud;
	private String leyendaEdoCtaVac;
	private String leyendaNip;
	private String leyendaRecibo;
	private String leyendaSolicitud;
	private BigDecimal minutosInactivo;
	private String mostrarLeyenda;
	private String mostrarPeriodoVac;
	private String nipLeyenda;
	private String nipRecibo;
	private String notaCorreoVacaciones;
	private String notaRecibo;
	private String notaSolAusentismo;
	private String notaSolDescEsp;
	private String notaSolPermiso;
	private String notaSolVacaciones;
	private BigDecimal numMeses;
	private BigDecimal numeroNotificaciones;
	private String passwordCiaFiel;
	private String periodoVisible;
	private String permiteAutorizacionAuto;
	private String permiteChatGrupal;
	private String permiteChatIndividual;
	private String permiteEscalacionAuto;
	private String permiteMediosDiasVac;
	private String permiteNotifSolicitudes;
	private String permitirAutorizacionAlterna;
	private String permitirIdse;
	private String preguntasSecretas;
	private String primaVacVisible;
	private String procesosVisibles;
	private String solicitarNipTarjeta;
	private String status;
	private String urlPluginFiel;
	private String userId;
	private String validarFirmaPerAnt;
	private String visualizaTarjeta;
}