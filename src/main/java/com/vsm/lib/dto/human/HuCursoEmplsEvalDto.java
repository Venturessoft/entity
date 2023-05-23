package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCursoEmplsEvalDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCursoEmplsEvalPKDto id;
	private String calificacionCualitativa;
	private BigDecimal calificacionTotal;
	private BigDecimal consecutivo;
	private LocalDateTime fechaEvaluacion;
	private LocalDateTime fechaInicio;
	private LocalDateTime fechaMov;
	private String status;
	private String userId;
}