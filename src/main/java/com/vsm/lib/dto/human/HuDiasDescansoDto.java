package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuDiasDescansoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuDiasDescansoPKDto id;
	private LocalDateTime fechaMod;
	private String status;
	private String usuario;
}