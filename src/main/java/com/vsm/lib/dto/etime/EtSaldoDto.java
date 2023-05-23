package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtSaldoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String folio;
	private String idUsuario;	
	private BigDecimal checadas;
	private String fechaCompra;	
	private BigDecimal subtotal;	
	private BigDecimal total;	
	private String estatus;
}