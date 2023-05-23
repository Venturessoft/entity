package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatRolDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatRolPKDto id;
	private String descripcionRol;
	private LocalDateTime fechaMov;
	private String gpoParm;
	private String status;
	private String userId;
}