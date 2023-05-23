package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta060PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta060Cia;
	private long ta060Grupo;
	private long ta060Secuencia;
}