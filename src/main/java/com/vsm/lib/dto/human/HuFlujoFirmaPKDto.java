package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuFlujoFirmaPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numEntidad;
	private String refLlave;
	private long idActividad;
	private long orden;
	private long numCiaAut;
	private long numEmpAut;
}