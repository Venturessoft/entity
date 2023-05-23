package com.vsm.lib.dto.seldb;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ColumDto {
	String nombreColumna;
	String tipoDato;	
}