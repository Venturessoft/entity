package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatProductoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String producto;
	private String descripcion;
	private BigDecimal orden;
	private String status;
	private String tablaVerifProd;
}