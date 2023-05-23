package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuRelojRegTxtDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuRelojRegTxtPKDto id;
	private BigDecimal comida;
	private String cveChecada;
	private String estacion;
	private LocalDateTime fechaMov;
	private String motChecada;
	private String status;
	private String userId;
}