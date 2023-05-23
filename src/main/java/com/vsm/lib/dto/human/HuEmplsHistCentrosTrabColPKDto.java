package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsHistCentrosTrabColPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numEmp;
	private long consecutivo;
	private LocalDate fechaAsignacion;
	private String centroTrabajo;
}