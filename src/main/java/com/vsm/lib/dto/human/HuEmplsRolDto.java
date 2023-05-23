package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsRolDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsRolPKDto id;
	private LocalDateTime fechaMov;
	private BigDecimal rol;
	private String status;
	private String userId;
}