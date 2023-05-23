package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatUcGralDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String siglasCliente;
	private LocalDateTime fechaMov;
	private BigDecimal idCohorteInstancia;
	private String nombreArchivo;
	private String nombreInstancia;
	private String status;
	private String token;
	private String url;
	private String userId;
}