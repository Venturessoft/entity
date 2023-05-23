package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta020PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta020Cia;
	private long ta020Codigo;
	private String ta020Clave;
	private String ta020Sclave;
}