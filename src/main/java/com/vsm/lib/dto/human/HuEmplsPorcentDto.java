package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsPorcentDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsPorcentPKDto id;
	private BigDecimal porcentaje;
	private String status;
}