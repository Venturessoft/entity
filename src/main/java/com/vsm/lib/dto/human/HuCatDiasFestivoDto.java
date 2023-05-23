package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatDiasFestivoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatDiasFestivoPKDto id;
	private String calEstandar;
	private String descripcion;
	private LocalDateTime fechaMov;
	private String gpoParm;
	private String status;
	private String tipoFestivo;
	private String userId;
}