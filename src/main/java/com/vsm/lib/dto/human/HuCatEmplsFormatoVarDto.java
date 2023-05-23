package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatEmplsFormatoVarDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String columna;
	private String edit;
	private LocalDateTime fechaMov;
	private BigDecimal formatoId;
	private BigDecimal numCia;
	private String opcion;
	private String status;
	private String userId;
}