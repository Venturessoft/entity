package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatMonedaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatMonedaPKDto id;
	private String abreviacion;
	private String descripcion;
	private String monedaCorriente;
	private String simbolo;
	private String status;
}