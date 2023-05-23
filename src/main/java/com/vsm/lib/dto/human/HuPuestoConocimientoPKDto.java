package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPuestoConocimientoPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String claveDelPuesto;
	private String claveTipo;
	private String claveConocimiento;
}