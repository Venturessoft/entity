package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta135Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta135PKDto id;
	private LocalDateTime ta135FechaMov;
	private String ta135Sts;
	private String ta135UsuarioMov;
}