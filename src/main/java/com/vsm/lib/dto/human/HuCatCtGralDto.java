package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatCtGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long cia;
	private String analisisComedor;
	private String analisisFaltas;
	private String analisisRetardos;
	private String asignaTurnoAut;
	private String calcDistribuido;
	private String checarRetardo;
	private String completaMarcaje;
	private String correoNotifCalculo;
	private String cveEntrada;
	private String cveEntradaCom;
	private String cveSalida;
	private String cveSalidaCom;
	private String defaultGafete;
	private BigDecimal depuracionChecadas;
	private BigDecimal depuracionChecadasCom;
	private String dobleTurno;
	private String email;
	private String etime;
	private LocalDateTime fechaHora;
	private LocalDateTime fechaMov;
	private BigDecimal grupoAvisoAus;
	private BigDecimal grupoDescargaTf;
	private BigDecimal histLog;
	private BigDecimal hrsBancoTiempoFlexible;
	private String leyendaAut;
	private BigDecimal minChecAntesEntrada;
	private BigDecimal minutosRevPoleo;
	private String mttoChecadasComedor;
	private String nivelesAutTe;
	private String omiteBajasInterfase;
	private String poleoEjecucion;
	private String poleoUsuario;
	private String repiteChecada;
	private String rutaArchBat;
	private String rutaArchPendiente;
	private String rutaArchPoleo;
	private String rutaExePoleo;
	private String schedulerXCia;
	private BigDecimal segundosDescRelojes;
	private BigDecimal segundosScheduler;
	private String selectivoPorEstacion;
	private String status;
	private String statusScheduler;
	private String tipoComida;
	private String tipoReloj;
	private String userId;
}