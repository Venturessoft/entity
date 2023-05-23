package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsAuditDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsAuditPKDto id;
	private String opcion;
	private String producto;
	private String userId;
	private String valorActual;
	private String valorAnterior;
}