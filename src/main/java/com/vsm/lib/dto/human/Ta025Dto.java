package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta025Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta025PKDto id;
	private String ta025Respalf;
	private BigDecimal ta025Respnum;
	private String ta025Sts;
	private String ta025Tiporesp;
}