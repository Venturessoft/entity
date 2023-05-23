package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuWeSuplenciaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuWeSuplenciaPKDto id;
	private LocalDateTime fechaMov;
	private BigDecimal numEmp;
	private BigDecimal numEmpSupl;
	private String status;
}