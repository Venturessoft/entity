package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuWeAutorizantesSolicitudPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long idSolicitud;
	private String tipoSolicitud;
	private String userId;
	private long numEmp;
}