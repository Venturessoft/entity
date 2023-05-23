package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsCapacitacionExtDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	HuEmplsCapacitacionExtPKDto id;
	String certificado;
	String descripcionCurso;
	LocalDate fechaFin;
	LocalDate fechaIni;
	LocalDateTime fechaMov;
	String impartidoEn;
	String nombreCurso;
	String status;
	String userId;
}