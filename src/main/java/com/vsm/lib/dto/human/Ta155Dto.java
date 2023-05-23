package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Ta155Dto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private Ta155PKDto id;
	private String ta155Aut;
	private String ta155Beacon;
	private String ta155Bssid;
	private BigDecimal ta155CoordX;
	private BigDecimal ta155CoordY;
	private String ta155Descr;
	private String ta155DireccIp;
	private String ta155EstCom;
	private LocalDateTime ta155FechaMov;
	private String ta155GpoParm;
	private String ta155Modelo;
	private BigDecimal ta155Radio;
	private String ta155Ruta;
	private String ta155Sts;
	private String ta155Tipo;
	private String ta155UserId;
	private BigDecimal ta155Zona;
}