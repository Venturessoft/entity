package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PrPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long prCia;
	private long prNumEmp;
	private LocalDateTime prFecha;
	private LocalDateTime prPermHhIni;
}