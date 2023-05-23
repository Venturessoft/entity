package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPandoraPublicacionDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idPublicacion;
	private LocalDateTime fechaMov;
	private BigDecimal idPerfilPuesto;
	private String nombrePubilcacion;
	private BigDecimal numVacantes;
	private String status;
	private String analizando;
}