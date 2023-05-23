package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPandoraUsuarioPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idUsuario;
	private long idIdioma;
	private long numCia;
	private String email;
}