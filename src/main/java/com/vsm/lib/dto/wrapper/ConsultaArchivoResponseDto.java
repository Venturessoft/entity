package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConsultaArchivoResponseDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private boolean error;
	private String codigo;
	private String resultado;
	private String archivo;
	
	public ConsultaArchivoResponseDto(boolean error, String codigo, String resultado) {		this.error = error;
		this.codigo = codigo;
		this.resultado = resultado;
	}
}