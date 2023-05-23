package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta020Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta020PKDto id;
	private String ta020Act;
	private String ta020Descr;
	private String ta020Sts;
}