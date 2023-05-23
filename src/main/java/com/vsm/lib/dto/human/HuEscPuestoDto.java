package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEscPuestoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEscPuestoPKDto id;
	private LocalDateTime fechaMov;
	private String gradoAcademico;
	private String status;
	private String tipoRequerido;
	private String userId;
}