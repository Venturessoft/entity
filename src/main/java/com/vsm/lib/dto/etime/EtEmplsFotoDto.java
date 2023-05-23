package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtEmplsFotoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private EtEmplsFotoPkDto id;
	private LocalDateTime fechaMovimiento;	
	private String estatus;
}
