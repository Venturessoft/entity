package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RvPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long rvCia;
	private long rvNumEmp;
	private LocalDateTime rvFechaEnt;
	private long rvConcepto;
	private long rvSecuencia;
}