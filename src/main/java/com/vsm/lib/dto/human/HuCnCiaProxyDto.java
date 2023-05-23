package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCnCiaProxyDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCnCiaProxyPKDto id;
	private LocalDateTime fecha;
	private String proxy;
	private String ruta;
	private String status;
	private String userId;
}