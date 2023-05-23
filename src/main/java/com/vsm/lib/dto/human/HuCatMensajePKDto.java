package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatMensajePKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String idioma;
	private String claveMensaje;
	private long numero;
}