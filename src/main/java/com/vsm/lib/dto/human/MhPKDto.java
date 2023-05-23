package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MhPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long mhCia;
	private long mhProceso;
	private long mhLote;
}