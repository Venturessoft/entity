package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatProvLocalidadIntPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String clavePais;
	private String claveProvincia;
	private String claveLocalidad;
	private String claveColonia;
}