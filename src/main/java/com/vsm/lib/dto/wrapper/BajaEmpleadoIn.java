package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BajaEmpleadoIn implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String causaBaja;
	String causaBajaReal;
	String fechaBaja;
	String observaciones;
	String usuario;
	String contrasena;
	long numCia;
	long numEmp;
}