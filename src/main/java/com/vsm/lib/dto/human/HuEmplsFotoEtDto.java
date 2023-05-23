package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsFotoEtDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsFotoEtPkDto id;
	private LocalDateTime fechaMovimiento;
	private String estatus;
}
