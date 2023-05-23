package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtImpuestoPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private BigDecimal idImpuesto;
	private String cvePais;
	private String fechaAplicacion;
}