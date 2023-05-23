package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta025PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta025Cia;
	private long ta025Zona;
	private String ta025Preg;
}