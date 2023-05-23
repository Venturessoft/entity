package com.vsm.lib.dto.human;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsEntrevistaSalDto implements Serializable { 
	private static final long serialVersionUID = 1L; 
	private HuEmplsEntrevistaSalPKDto id;
	private String atConsecutivo;
	private String causaBaja;
	private String comentarios;
	private String descripcionCausa;
	private String entrevistador;
	private LocalDateTime fechaEntrevista;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaReal;
	private BigDecimal nipEmpleado;
	private BigDecimal resultado;
	private String salida;
	private String status;
	private String userId;
}