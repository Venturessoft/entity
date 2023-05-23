package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VpDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private VpPKDto id;
	private BigDecimal vpDiasCorresp;
	private BigDecimal vpDiasPagados;
	private BigDecimal vpDiasPorDisfr;
	private BigDecimal vpDiasTotADisfr;
	private LocalDateTime vpFechaVencimiento;
	private LocalDateTime vpFechaVencimientoPais;
	private String vpRefrendo;
	private String vpStatus;
}