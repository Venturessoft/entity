package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsEscolaridadDescDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsEscolaridadDescPKDto id;
	private BigDecimal anioEmision;
	private String claveEstadoEsc;
	private String claveMunicipioEsc;
	private String clavePaisEsc;
	private BigDecimal doctoProbatorio;
	private String escuela;
	private LocalDateTime fechaMov;
	private LocalDateTime final_;
	private String gradoAcademico;
	private LocalDateTime inicio;
	private String status;
	private BigDecimal tipoInstitucion;
	private String userId;	
	private BigDecimal claveNivelEsc;
	private String claveProfesion;
	private HuCatNivelEscolaridadDto huCatNivelEscolaridad;
	private HuProfesionDto huProfesion;
}