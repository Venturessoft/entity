package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private PrPKDto id;
	private BigDecimal prConcepto;
	private LocalDateTime prFechaCap;
	private LocalDateTime prHoraCap;
	private BigDecimal prHrsPer1;
	private BigDecimal prHrsPer2;
	private BigDecimal prMinRetardo;
	private String prObservacion;
	private LocalDateTime prPermHhFin;
	private String prSts;
	private String prUsuario;
}