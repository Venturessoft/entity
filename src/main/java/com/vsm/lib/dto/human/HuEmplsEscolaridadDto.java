package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsEscolaridadDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsEscolaridadPKDto id;
	private BigDecimal anioEmision;
	private String claveEstadoEsc;
	private String claveMunicipioEsc;
	private BigDecimal claveNivelEsc;
	private String clavePaisEsc;
	private String claveProfesion;
	private BigDecimal doctoProbatorio;
	private String escuela;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaFinal;
	private String gradoAcademico;
	private LocalDateTime fechaInicio;
	private String status;
	private BigDecimal tipoInstitucion;
	private String userId;
}