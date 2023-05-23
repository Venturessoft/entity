package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsRolPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numEmp;
	private LocalDateTime fechaModRol;
}