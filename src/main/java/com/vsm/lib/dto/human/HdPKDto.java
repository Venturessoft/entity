package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HdPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long hdCia;
	private long hdNumEmp;
	private long hdAaProc;
}