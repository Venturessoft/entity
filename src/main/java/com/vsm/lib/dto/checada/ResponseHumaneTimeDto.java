package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResponseHumaneTimeDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String codigo;
	private String estacion;
	
	ValidaEstacionEtDto estOut;
}