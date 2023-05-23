package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsCtrlUniformeDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsCtrlUniformePKDto id;
	private LocalDateTime fechaMov;
	private BigDecimal prenda1;
	private String prenda10;
	private BigDecimal prenda2;
	private BigDecimal prenda3;
	private BigDecimal prenda4;
	private BigDecimal prenda5;
	private String prenda6;
	private String prenda7;
	private String prenda8;
	private String prenda9;
	private String status;
	private String userId;
}