package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MvPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long mvdCia;
	private long mvdProceso;
	private long mvdLote;
	private long mvdNumReg;
}