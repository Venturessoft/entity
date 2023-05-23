package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatNivelEscolaridadDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatNivelEscolaridadPKDto id;
	private String descripcionEsc;
	private LocalDateTime fechaMov;
	private BigDecimal nivelEscStps;
	private BigDecimal porcSubsidio;
	private String status;
	private String userId;
}