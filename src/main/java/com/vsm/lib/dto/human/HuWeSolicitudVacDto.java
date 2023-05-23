package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuWeSolicitudVacDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuWeSolicitudVacPKDto id;
	private String aplicaFinDe;
	private String diasNaturalHabil;
	private BigDecimal diasTomados;
	private LocalDateTime fechaIni;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaTer;
	private String pagoAnticipado;
	private String secAdicional;
	private String solicitaPago;
	private String status;
	private String userId;
}