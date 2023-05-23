package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta135PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta135Cia;
	private String ta135Usuario;
	private long ta135Zona;
	private String ta135Area;
	private String ta135Centro;
	private String ta135Linea;
	private String ta135TipoEmpl;
}