package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatTablasColumnaPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private String version;
	private String tabla;
	private String columna;
}