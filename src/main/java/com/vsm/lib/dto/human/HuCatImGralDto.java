package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatImGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String aguinaldoFijo;
	private BigDecimal ayudaAlimentacionPorc1;
	private BigDecimal ayudaAlimentacionPorc2;
	private BigDecimal ayudaAlimentacionPorc3;
	private String calIntAniv;
	private String calIntIncap;
	private String campoFactorSdoMensual;
	private BigDecimal concSubsid;
	private String facInt;
	private LocalDateTime fechaMov;
	private String planFlexible;
	private String status;
	private String userId;
	private String valorFactorSdoMensual;
}