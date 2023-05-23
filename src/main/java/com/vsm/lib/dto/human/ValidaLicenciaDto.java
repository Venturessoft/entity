package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ValidaLicenciaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	String codigo;
	HuCompaniaDto huCompaniaDto;
	List<HuClienteConnectDto> huClienteConnectDto;
}