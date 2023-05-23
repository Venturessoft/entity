package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPandoraUsuarioDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuPandoraUsuarioPKDto id;
	private String apellidoMat;
	private String apellidoPat;
	private String direccion;
	private String fotografia;
	private String nombre;
	private String password;
	private String rfc;
	private String status;
	private String telefono;
}