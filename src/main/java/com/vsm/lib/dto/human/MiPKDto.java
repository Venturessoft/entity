package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MiPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long miCia;
	private long miNumEmp;
	private String miCveMov;
	private LocalDateTime miFecMov;
}