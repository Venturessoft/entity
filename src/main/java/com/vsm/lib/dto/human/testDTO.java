package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class testDTO implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String numCia;
	private String numEmp;
	private String id;
	private LocalDate fechaMov;
	private String estacion;
	private byte fotografia;
	private LocalDateTime fechaChecada;
	private String codigoEtime;
	private String tipo;
	private BigDecimal latitud;
	private BigDecimal longitud;
	private String beacon01;
	private String beacon02;
	private String beacon03;
	private String beacon04;
	private String beacon05;
	private String estacion01;
	private String estacion02;
	private String estacion03;
	private String estacion04;
	private String estacion05;
	private String status;
	private String fechaInicio;
	private String fechaFin;
}