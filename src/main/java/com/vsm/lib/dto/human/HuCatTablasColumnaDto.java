package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatTablasColumnaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatTablasColumnaPKDto id;
	private BigDecimal decimales;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String generaTxt;
	private String llavePrimaria;
	private BigDecimal longitud;
	private String nulos;
	private String obligatorio;
	private BigDecimal posicion;
	private String status;
	private String tipoDato;
	private String tituloColumna;
	private String userId;
	private String valorInicial;
}