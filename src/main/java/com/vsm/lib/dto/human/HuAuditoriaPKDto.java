package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuAuditoriaPKDto  implements Serializable {
	private static final long serialVersionUID = 1L;
		
	long numCia;
	String userId;
	LocalDateTime fechaMov;
	String producto; 
	String opcion; 
	String tabla;
	String campoReferencia;
	String valorReferencia;
	String tipoMov;
	String campo;
	String valorAnterior;
	String valorActual;
}