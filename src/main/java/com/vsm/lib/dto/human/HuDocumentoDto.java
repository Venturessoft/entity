package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuDocumentoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private long numDocumento;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String imprimeWs;
	private String status;
	private BigDecimal tablaBd;
	private String userId;
}