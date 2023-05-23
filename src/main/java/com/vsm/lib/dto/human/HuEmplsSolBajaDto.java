package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsSolBajaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsSolBajaPKDto id;
	private String avisoRfc;
	private String causaBaja;
	private String causaBajaReal;
	private String contratable;
	private LocalDateTime fechaBaja;
	private LocalDateTime fechaEntSal;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaSol;
	private String formaPago;
	private String formatoEnt;
	private BigDecimal grupo;
	private String limpiaBanco;
	private BigDecimal lote;
	private String observacion;
	private BigDecimal proceso;
	private String status;
	private String statusSol;
	private String userId;
	private BigDecimal vigencia;
}