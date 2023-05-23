package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatalogoBancoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatalogoBancoPKDto id;
	private BigDecimal aValidar;
	private String claveBancoSat;
	private String descripcion;
	private LocalDateTime fechaMov;
	private BigDecimal longitudCuenta;
	private String status;
	private String userId;
}