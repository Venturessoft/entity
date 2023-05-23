package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatalogoPuestoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numeroCompania;
	private String claveDelPuesto;
	private BigDecimal antiguedad;
	private String asignarSueldoEmp;
	private String autorizaRh;
	private String categoria;
	private String certificacion;
	private String chlTipoPuesto;
	private String claveTipoTabulador;
	private String colOcupacionHs;
	private BigDecimal crcOcupacionCcss;
	private BigDecimal crcOcupacionIns;
	private String descripAlternativaGral;
	private String descripcion;
	private String ecuGpoOcupaIess;
	private BigDecimal edadMaxima;
	private BigDecimal edadMinima;
	private String estadoCivil;
	private LocalDateTime fechaMonto;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaMovAutorizacion;
	private BigDecimal grado;
	private BigDecimal gradoAdmonSueldos;
	private BigDecimal headcount;
	private String mexOcupacionCe;
	private BigDecimal monto;
	private BigDecimal monto2;
	private BigDecimal monto3;
	private BigDecimal monto4;
	private BigDecimal monto5;
	private String motivoFinPublic;
	private String nivelPuesto;
	private String nuevaCreacion;
	private BigDecimal numSerie;
	private BigDecimal numeroFormato;
	private BigDecimal porcentaje1;
	private BigDecimal porcentaje2;
	private String publicable;
	private String puestoAQueReporta;
	private String sexo;
	private String status;
	private BigDecimal sueldo;
	private BigDecimal tiempoCobVacantes;
	private BigDecimal totalPuntosDimension;
	private String ultimoPuesto;
	private String userId;
	private String userIdAutorizacion;
	private String validaSueldoTab;
	private BigDecimal zona;
}