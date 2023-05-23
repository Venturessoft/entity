package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuMovsExcepWebPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long proceso;
	private long anio;
	private long numPer;
	private String usuario;
	private long numReg;
}