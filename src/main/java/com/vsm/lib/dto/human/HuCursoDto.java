package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCursoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCursoPKDto id;
	private String area;
	private BigDecimal asistenciaReq;
	private String centro;
	private String claseCurso;
	private String claveFormatoCurso;
	private String claveFormatoEmpls;
	private String claveFormatoExamen;
	private String claveMoneda;
	private String claveProveedor;
	private String claveTipoCurso;
	private BigDecimal costoGrupo;
	private BigDecimal costoIndirecto;
	private BigDecimal costoUnitario;
	private BigDecimal cupoMaximo;
	private BigDecimal cupoMinimo;
	private String cursoLinea;
	private String dirigidoA;
	private BigDecimal duracionCurso;
	private LocalDateTime fechaIniCurso;
	private LocalDateTime fechaMov;
	private String frecuencia;
	private String gpoParm;
	private BigDecimal idCursoUc;
	private String linea;
	private String mexTematica;
	private BigDecimal modalidad;
	private String necesidad;
	private String nivelAcceso;
	private String nombreCortoCurso;
	private String nombreCurso;
	private String normaStps;
	private BigDecimal objetivo;
	private String objetivoGeneral;
	private BigDecimal personasXGrupo;
	private String promedioRep;
	private String siempreVisible;
	private String status;
	private String temario1;
	private String temario10;
	private String temario2;
	private String temario3;
	private String temario4;
	private String temario5;
	private String temario6;
	private String temario7;
	private String temario8;
	private String temario9;
	private String userId;
	private BigDecimal zona;
}