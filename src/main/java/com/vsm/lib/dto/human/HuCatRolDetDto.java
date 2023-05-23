package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatRolDetDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatRolDetPKDto id;
	private String diasDescanso;
	private LocalDateTime fechaFin;
	private LocalDateTime fechaMov;
	private String secuenciaInicial;
	private String status;
	private String userId;
}