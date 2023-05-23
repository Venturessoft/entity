package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtImpuestoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private EtImpuestoPKDto id;
	private BigDecimal costoxChecada;	
	private BigDecimal impuesto;	
	private String estatus;
}