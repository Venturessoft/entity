package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPandoraHashtagPublicacionDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idHashtag;
	private java.math.BigDecimal idPublicacion;
	private String nombre;
	private String status;
}