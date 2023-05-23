package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta060Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta060PKDto id;
	private BigDecimal ta060Cpto01;
	private BigDecimal ta060Cpto02;
	private BigDecimal ta060Cpto03;
	private BigDecimal ta060Cpto04;
	private BigDecimal ta060Cpto05;
	private BigDecimal ta060Cpto06;
	private BigDecimal ta060Cpto07;
	private BigDecimal ta060Cpto08;
	private BigDecimal ta060Cpto09;
	private BigDecimal ta060Cpto10;
	private String ta060CveAcum;
	private String ta060Descr;
	private String ta060Sts;
}