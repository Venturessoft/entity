package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCandOfertaLabDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCandOfertaLabPKDto id;
	private String autOferta;
	private String comentarios;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaOferta;
	private BigDecimal numFlujo;
	private String status;
	private String userId;
}