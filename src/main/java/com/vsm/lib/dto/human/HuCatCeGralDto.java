package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatCeGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String asistencia;
	private String calificacionAutomatica;
	private String capacitadorExterno;
	private String evaluacionCualitativa;
	private String evaluacionCuantitativa;
	private LocalDateTime fechaMov;
	private String periodicidadAutorizar;
	private String periodicidadConstancias;
	private String status;
	private String userId;
	private String visibleAutorizar;
	private String visibleConstancias;
}