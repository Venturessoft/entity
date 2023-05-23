package com.vsm.lib.utilitys;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Parametros implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String pais;
	String etiqueta1;
	String etiqueta2;
	String cia;
}