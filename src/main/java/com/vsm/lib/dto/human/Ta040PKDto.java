package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta040PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta040Cia;
	private long ta040Proceso;
	private long ta040Anio;
	private long ta040NumPer;
}