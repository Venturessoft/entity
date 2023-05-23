package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsTokenDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	HuEmplsTokenPKDto id;
	private String token;
	private String detalleDisp;
}