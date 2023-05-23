package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsAcumPerPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long proceso;
	private long anio;
	private long periodo;
	private long numEmp;
	private long contrato;
	private long zona;
	private String area;
	private String centro;
	private String linea;
	private long secuencia;
	private long concepto;
	private long referencia;
	private long factor;
}