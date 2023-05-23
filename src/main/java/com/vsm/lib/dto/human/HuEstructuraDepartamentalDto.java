package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEstructuraDepartamentalDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEstructuraDepartamentalPKDto id;
	private String agrupacion1;
	private String agrupacion2;
	private String agrupacion3;
	private String claveLocalidad;
	private String claveProvincia;
	private String cuentaContable;
	private String descripAlternativaGral;
	private String descripcionEstructura;
	private LocalDateTime fechaMov;
	private String status;
	private String userId;
}