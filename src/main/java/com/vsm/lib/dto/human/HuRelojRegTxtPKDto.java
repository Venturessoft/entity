package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuRelojRegTxtPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long cia;
	private long numEmp;
	private LocalDate fecha;
	private LocalDateTime hora;
}