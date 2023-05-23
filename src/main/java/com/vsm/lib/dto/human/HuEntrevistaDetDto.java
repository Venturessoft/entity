package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEntrevistaDetDto implements Serializable  { 
	private static final long serialVersionUID = 1L; 

	private HuEntrevistaDetPKDto id;
	private LocalDateTime fechaMov;
	private String respuestaTexto;
	private String respuestaValor;
	private String status;
	private String userId;
}