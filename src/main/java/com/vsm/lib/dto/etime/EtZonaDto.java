package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtZonaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idZona;
	private String descripcion;
	private String estatus;
}