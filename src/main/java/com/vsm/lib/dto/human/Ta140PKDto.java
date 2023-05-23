package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta140PKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long ta140Cia;
	private long ta140CveTurno;
}