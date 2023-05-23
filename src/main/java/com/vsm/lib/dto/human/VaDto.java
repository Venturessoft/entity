package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private VaPKDto id;
	private String vaDiasNaturalHabil;
	private BigDecimal vaDiasPagados;
	private BigDecimal vaDiasTomados;
	private LocalDateTime vaFecha;
	private LocalDateTime vaFechaIni;
	private LocalDateTime vaFechaPago;
	private LocalDateTime vaFechaTer;
	private LocalDateTime vaHora;
	private String vaPagoAnticipa;
	private String vaStatus;
	private String vaUsuario;
	private String vaVacAnticipa;
}