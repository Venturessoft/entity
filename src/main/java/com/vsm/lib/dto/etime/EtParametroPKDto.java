package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtParametroPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idParametro;
	private String parametro;
	private String valor;
}