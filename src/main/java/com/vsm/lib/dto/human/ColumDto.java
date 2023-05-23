package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ColumDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String nombreColumna;
	String tipoDato;	
}