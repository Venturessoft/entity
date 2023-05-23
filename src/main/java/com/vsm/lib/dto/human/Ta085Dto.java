package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta085Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta085PKDto id;
	private String ta085Agrupacion1;
	private String ta085Agrupacion2;
	private String ta085CtaCont;
	private String ta085Descr;
	private String ta085Sts;
}