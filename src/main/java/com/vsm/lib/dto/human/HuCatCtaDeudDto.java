package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatCtaDeudDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatCtaDeudPKDto id;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String status;
	private String userId;
}