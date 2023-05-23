package com.vsm.lib.dto.wrapper; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ConsultaArchivoRequestDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	  String claveRuta;
	  long numCia;
	  long x;
	  long y;
}