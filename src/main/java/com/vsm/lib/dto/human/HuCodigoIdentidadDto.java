package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCodigoIdentidadDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCodigoIdentidadPKDto id;
	private LocalDateTime fechaMov;
	private String obligatorio;
	private String preguntaRespuesta;
	private String status;
	private String userId;
	private String valorDefauld;
}