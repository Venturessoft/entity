package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatToGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String parametro;
	private LocalDateTime fechaMov;
	private String status;
	private String userId;
	private String valorAlfanumerico;
	private BigDecimal valorNumerico;
}