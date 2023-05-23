package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatFtActividadesPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String claveProducto;
	private String claveProceso;
	private String claveTipo;
	private String claveActividad;
}