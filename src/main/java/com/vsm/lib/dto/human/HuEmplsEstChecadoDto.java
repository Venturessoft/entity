package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsEstChecadoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsEstChecadoPKDto id;
	private LocalDateTime fechaMov;
	private String status;
	private String tipo;
	private String userId;
}