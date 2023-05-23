package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCursoCalendarioDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCursoCalendarioPKDto id;
	private String area;
	private String atConsecutivo;
	private String atConsecutivoEval;
	private String banderaCostoIndCurso;
	private String banderaCostoIndEmpl;
	private String centro;
	private String claseCurso;
	private BigDecimal claveCalendario;
	private String claveMoneda;
	private String claveProveedor;
	private String claveSala;
	private BigDecimal costoGrupo;
	private BigDecimal costoUnitario;
	private BigDecimal cupoMaximo;
	private BigDecimal cupoMinimo;
	private BigDecimal diasCurso;
	private LocalDateTime fechaFinal;
	private LocalDateTime fechaMov;
	private LocalDateTime horaFinal;
	private LocalDateTime horaFinalComida;
	private LocalDateTime horaInicio;
	private LocalDateTime horaInicioComida;
	private BigDecimal idInstructorProv;
	private String linea;
	private BigDecimal maxEmpCostoGpo;
	private BigDecimal modalidad;
	private BigDecimal numCiaInstructor;
	private BigDecimal numEmpInstructor;
	private BigDecimal objetivo;
	private String status;
	private String userId;
	private BigDecimal zona;
}