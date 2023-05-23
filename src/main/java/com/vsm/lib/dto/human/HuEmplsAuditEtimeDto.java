package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsAuditEtimeDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsAuditEtimePKDto id;
	private String beacon01;
	private String beacon02;
	private String beacon03;
	private String beacon04;
	private String beacon05;
	private String codigoEtime;
	private String estacion;
	private String estacion01;
	private String estacion02;
	private String estacion03;
	private String estacion04;
	private String estacion05;
	private LocalDateTime fechaChecada;
	private LocalDateTime fechaMov;
	private String fotografia;
	private BigDecimal latitud;
	private BigDecimal longitud;
	private String status;
	private String tipo;
}