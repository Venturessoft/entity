package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConsultaAmbByCiaOutDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String codigo;
	String ambiente;
	String compania;
	String numEmpleado;	
}