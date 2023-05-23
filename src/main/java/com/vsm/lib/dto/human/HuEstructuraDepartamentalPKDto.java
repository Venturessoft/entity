package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEstructuraDepartamentalPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long claveCompania;
	private String area;
	private String centro;
	private String linea;
}