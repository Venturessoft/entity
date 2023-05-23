package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuProfesionDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuProfesionPKDto id;
	private String descripcionProfesion;
	private LocalDateTime fechaMov;
	private String status;
	private String userId;
}