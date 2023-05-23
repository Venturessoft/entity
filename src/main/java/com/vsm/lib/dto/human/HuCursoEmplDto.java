package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCursoEmplDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCursoEmplPKDto id;
	private String atConsecutivo;
	private String atConsecutivoAuto;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaMovAutorizacion;
	private String status;
	private String userId;
	private String userIdAutorizacion;
}