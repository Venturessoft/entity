package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEntrevistaDetPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numEmp;
	private long folioSol;
	private String tipoEntrevista;
	private String claveFormato;
	private long folioReq;
	private String claveCurso;
	private long numCiaEntrevista;
	private long numEmpEntrevista;
	private long ciclo;
	private long numPreg;
}