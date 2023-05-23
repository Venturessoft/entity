package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCnActividadesUsuarioPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private BigDecimal ciaActividad;
	private String consecutivo;
	private BigDecimal idActividad;
}