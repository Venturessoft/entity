package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtCiaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idCia;
	private String cve;
	private String cveIdioma;
	private String estatus;
	private String nombre;
}