package com.vsm.lib.dto.human;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsEntrevistaSalPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numEmp;
	private String tipoEntrevista;
	private String claveFormato;
	private long ciclo;
}