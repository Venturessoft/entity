package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuMarcadorDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numDocumento;
	private long numMarcador;
	private String argumento;
	private String campoBd;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String formato;
	private String status;
	private String tabla;
	private String userId;
	private String valorDefault;
	private String valorImpresion;
}