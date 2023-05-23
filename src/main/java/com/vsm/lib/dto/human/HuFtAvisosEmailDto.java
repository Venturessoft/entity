package com.vsm.lib.dto.human; 
 
import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuFtAvisosEmailDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuFtAvisosEmailPKDto id;
	private String asunto;
	private LocalDateTime fechaMov;
	private String mensaje;
	private String status;
	private String userId;
}