package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuClienteConnectDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuClienteConnectPKDto id;
	private BigDecimal año;
	private BigDecimal checadaDias;
	private BigDecimal conexiones;
	private BigDecimal conexionesGpoA;
	private BigDecimal conexionesGpoB;
	private BigDecimal conexionesGpoC;
	private BigDecimal conexionesGpoD;
	private BigDecimal conexionesGpoE;
	private BigDecimal conexionesGpoF;
	private BigDecimal conexionesGpoG;
	private BigDecimal conexionesGpoH;
	private BigDecimal conexionesGpoI;
	private BigDecimal conexionesGpoJ;
	private LocalDateTime fechaFin;
	private LocalDateTime fechaMov;
	private String generaCfdi;
	private BigDecimal publicacionesAnuales;
	private String status;
	private String userId;
}