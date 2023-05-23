package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RePoleoOut implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String codigo;
	String mensaje;
}