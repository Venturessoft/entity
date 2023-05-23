package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuFlujoFirmaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuFlujoFirmaPKDto id;
	private String atConsecutivo;
	private String comentario;
	private LocalDateTime fechaAut;
	private LocalDateTime fechaMov;
	private BigDecimal nip;
	private String parametro1;
	private String parametro2;
	private String parametro3;
	private BigDecimal plazaAut;
	private String puestoAut;
	private String status;
	private String userId;
}