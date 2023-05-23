package com.vsm.lib.dto.human;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCnActividadesUsuarioDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCnActividadesUsuarioPKDto id;
	private BigDecimal ciaUserId;
	private String esSuplencia;
	private LocalDateTime fechaEntrega;
	private LocalDateTime fechaFinal;
	private LocalDateTime fechaGeneracion;
	private LocalDateTime fechaIniAdmon;
	private LocalDateTime fechaMov;
	private LocalDateTime fhUltNotificacion;
	private String mensaje;
	private BigDecimal numNotificacion;
	private String status;
	private String userId;
	private String userIdGeneracion;
	private String userIdMov;
}