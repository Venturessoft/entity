package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatWebGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private BigDecimal ajusteDiasLab;
	private String cuenta;
	private LocalDateTime fechaMov;
	private String formaPagoPer;
	private String formatoImpresionDoc;
	private BigDecimal grupoDiasFaltantes;
	private BigDecimal grupoHrsExtras;
	private BigDecimal grupoSueldo;
	private BigDecimal numDigZona;
	private BigDecimal numRegsAltasEventuales;
	private BigDecimal numRegsXLote;
	private String status;
	private String userId;
}