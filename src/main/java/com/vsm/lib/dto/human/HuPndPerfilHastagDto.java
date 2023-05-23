package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPndPerfilHastagDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idPerfilPuesto;
	private String aliasPerfil;
	private String nombrePerfil;
	private BigDecimal numCia;
	private String status;
	private LocalDateTime fechaMov;
	private List<HuPandoraHashtagDto> huPandoraHashtag;
}