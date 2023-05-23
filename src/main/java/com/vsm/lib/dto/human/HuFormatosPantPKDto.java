package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuFormatosPantPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long numeroCompania;
	private long tablaBd;
	private long numeroFormato;
	private long renglon;
}