package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AgPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long agCia;
	private long agNumEmp;
	private long agGrupo;
	private long agAaAcum;
}