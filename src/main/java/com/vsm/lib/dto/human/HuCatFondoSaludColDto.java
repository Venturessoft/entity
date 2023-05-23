package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatFondoSaludColDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatFondoSaludColPKDto id;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String nit;
	private String status;
	private String userId;
}