package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsIdiomaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsIdiomaPKDto id;
	private BigDecimal escribe;
	private BigDecimal habla;
	private BigDecimal lectura;
	private BigDecimal porcGral;
	private String status;
	private BigDecimal traduce;
}