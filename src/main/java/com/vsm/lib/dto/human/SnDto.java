package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SnDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private SnPKDto id;
	private String snClaveMoneda;
	private String snDescripcion;
	private LocalDateTime snFecContr;
	private LocalDateTime snFecIni;
	private BigDecimal snImpteIni;
	private BigDecimal snImptePag;
	private BigDecimal snImptePago;
	private BigDecimal snNumPagos;
	private BigDecimal snPagosRealiz;
	private BigDecimal snSaldo;
	private String snSts;
	private String snStsPrestamo;
	private String snStsProceso;
}