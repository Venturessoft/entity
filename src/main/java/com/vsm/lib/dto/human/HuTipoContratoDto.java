package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuTipoContratoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numCia;
	private String claveTipoContrato;
	private String descripcionTipoContrato;
	private BigDecimal diasDuracion;
	private LocalDateTime fechaMov;
	private BigDecimal numDocumento;
	private String status;
	private String tipoContratoSat;
	private String userId;
}