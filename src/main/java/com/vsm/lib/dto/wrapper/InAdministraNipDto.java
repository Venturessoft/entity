package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InAdministraNipDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String claveCompania;
	String numEmp;
	String idioma;
	
	String nip;
	String nipConfirmacion;
	String campo1;
	String campo2;
	
	String nipActual;
	String nipNuevo;
}