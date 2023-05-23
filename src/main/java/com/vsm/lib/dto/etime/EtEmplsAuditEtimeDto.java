package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtEmplsAuditEtimeDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private EtEmplsAuditEtimePKDto id;
	private LocalDateTime fechaChecada;
	private LocalDateTime fechaMov;
	private String idEstacion;
	private BigDecimal latitud;
	private BigDecimal longitud;
	private String status;
	private String tipo;
}