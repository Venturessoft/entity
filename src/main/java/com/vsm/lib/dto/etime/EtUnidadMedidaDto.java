package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtUnidadMedidaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

  private String cveUnidad;  
  private String descripcion;  
  private String estatus;
  private BigDecimal valorMetros;
}