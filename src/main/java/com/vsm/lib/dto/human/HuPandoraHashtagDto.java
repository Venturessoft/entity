package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPandoraHashtagDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idPerfilPuesto;
	private BigDecimal idHashtag;
	private String nombre;
	private String status;
}