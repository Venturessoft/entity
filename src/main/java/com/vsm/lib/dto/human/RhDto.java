package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RhDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private RhPKDto id;
	private String rhArea;
	private String rhCategoria;
	private String rhCentro;
	private BigDecimal rhCveHor;
	private BigDecimal rhCveTurno;
	private String rhDescDom;
	private String rhDescJue;
	private String rhDescLun;
	private String rhDescMar;
	private String rhDescMie;
	private String rhDescSab;
	private String rhDescVie;
	private LocalDateTime rhFecFin;
	private LocalDateTime rhFechaModif;
	private LocalDateTime rhHoraModif;
	private String rhLinea;
	private String rhSts;
	private String rhUsuario;
	private BigDecimal rhZona;
}