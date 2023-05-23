package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta010PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta010Cia;
	private long ta010Modulo;
	private long ta010Proceso;
}