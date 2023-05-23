package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuWeFtFirmaVacDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuWeFtFirmaVacPKDto id;
	private String consecutivo;
	private String esAlterno;
	private LocalDateTime fechaMov;
	private BigDecimal nip;
	private BigDecimal nivel;
	private BigDecimal plazaAut;
	private String puestoAut;
	private String status;
	private String userId;
}