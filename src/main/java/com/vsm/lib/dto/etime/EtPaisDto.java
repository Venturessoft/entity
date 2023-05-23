package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtPaisDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String cvePais;
	private String descripcion;
}