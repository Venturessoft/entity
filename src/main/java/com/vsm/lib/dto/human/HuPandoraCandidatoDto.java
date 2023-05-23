package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPandoraCandidatoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idCandidato;
	private String cv;
	private String foto;
	private String nombreCandidato;
	private String nombreCv;
	private String status;
	private BigDecimal idPublicacion;
	
	private String orden;
	private String cvSeleccionado;
}