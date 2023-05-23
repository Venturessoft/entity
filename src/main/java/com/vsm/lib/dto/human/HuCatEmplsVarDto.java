package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatEmplsVarDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatEmplsVarPKDto id;
	private BigDecimal columnaId;
	private String cvePnem;
	private BigDecimal decimales;
	private String etiqueta;
	private LocalDateTime fechaMov;
	private String formatoCaptura;
	private BigDecimal longitud;
	private String obligatorio;
	private String opciones;
	private String pnemonico;
	private String status;
	private String tipoCaptura;
	private String tipoDato;
	private String userId;
	private String valorDefault;
	private String visible;
}