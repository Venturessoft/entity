package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsUcDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsUcPKDto id;
	private LocalDateTime fechaMov;
	private BigDecimal idUsuarioUc;
	private String status;
	private String userId;
}