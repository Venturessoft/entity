package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RePoleoIn implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String usuario;
    String password;
    int cia;
    long empleado;
    String fecha;
}