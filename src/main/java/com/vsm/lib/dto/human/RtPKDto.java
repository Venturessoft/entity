package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RtPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long rtCia;
	private long rtNumEmp;
	private String rtFecMov;
	private String rtHoraEnt;
}