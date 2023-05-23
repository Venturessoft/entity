package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuPuestoConocimientoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuPuestoConocimientoPKDto id;
	private String dominio;
	private LocalDateTime fechaMov;
	private String importancia;
	private String status;
	private String userId;
}