package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta010Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta010PKDto id;
	private String ta010AcumPer;
	private String ta010AgrupaProcesos;
	private BigDecimal ta010Anio;
	private String ta010Area;
	private String ta010BloqueoBajas;
	private String ta010BorraLotes;
	private String ta010CalEjecSelectivo;
	private String ta010CalcEjecucion;
	private String ta010CalcRhd;
	private String ta010CalcSelectivo;
	private String ta010CalcUsuario;
	private String ta010Centro;
	private String ta010CierreEjecucion;
	private String ta010CierreUsuario;
	private String ta010CodId01;
	private String ta010CodId02;
	private String ta010CodId03;
	private String ta010CodId04;
	private String ta010CodId05;
	private String ta010CodId06;
	private String ta010CodId07;
	private String ta010CodId08;
	private String ta010CodId09;
	private String ta010CodId10;
	private String ta010CodId11;
	private String ta010CodId12;
	private String ta010CodId13;
	private String ta010CodId14;
	private String ta010CodId15;
	private String ta010CodId16;
	private String ta010CodId17;
	private String ta010CodId18;
	private String ta010CodId19;
	private String ta010CodId20;
	private String ta010CodId21;
	private String ta010CodId22;
	private String ta010CodId23;
	private String ta010CodId24;
	private String ta010CodId25;
	private String ta010CodId26;
	private String ta010CodId27;
	private String ta010CodId28;
	private String ta010CodId29;
	private String ta010CodId30;
	private String ta010DesfasePeriodos;
	private LocalDateTime ta010FUltCierre;
	private String ta010GeneraCfdi;
	private String ta010GeneraFiel;
	private String ta010Linea;
	private BigDecimal ta010NumPer;
	private BigDecimal ta010NumPerAcum;
	private String ta010OrigenRecursosSat;
	private BigDecimal ta010PeriodicidadPagoSat;
	private BigDecimal ta010Periodo;
	private String ta010PolizasPropor;
	private String ta010ProcFinliq;
	private BigDecimal ta010ProcesoCapFinliq;
	private String ta010Reloj;
	private String ta010RespAut;
	private String ta010Sts;
	private String ta010TipoEmp;
	private String ta010TipoNominaSat;
}