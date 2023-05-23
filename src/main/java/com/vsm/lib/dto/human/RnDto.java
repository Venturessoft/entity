package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RnDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private RnPKDto id;
	private String rnArea;
	private String rnCausaRetardo;
	private String rnCentro;
	private String rnChequeo;
	private BigDecimal rnComida;
	private String rnEstacion;
	private LocalDateTime rnFecModif;
	private BigDecimal rnGafete;
	private LocalDateTime rnHorEnt;
	private LocalDateTime rnHorSal;
	private LocalDateTime rnHoraModif;
	private String rnLinea;
	private String rnSts;
	private String rnUsuario;
	private BigDecimal rnZona;
}