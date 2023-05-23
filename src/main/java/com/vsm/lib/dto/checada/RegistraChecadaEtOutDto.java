package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegistraChecadaEtOutDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	boolean isError;
	String  errorMessage;
	
	String codigo;
	String estacion;
	
	ValidaEstacionHuDto estacionesAudit;
}