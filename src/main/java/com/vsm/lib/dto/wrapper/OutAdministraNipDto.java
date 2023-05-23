package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import com.vsm.lib.utilitys.Parametros;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutAdministraNipDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String codigo;
	Parametros sParametros;
		
	String idCompania;
}