package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuCatImpEstatalDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuCatImpEstatalPKDto id;
	private BigDecimal conceptoPago;
	private BigDecimal conceptoProvision;
	private String descripcion;
	private LocalDateTime fechaMov;
	private BigDecimal grupoExcentos;
	private BigDecimal grupoTotales;
	private BigDecimal importeExcento;
	private BigDecimal matrizImpuesto;
	private BigDecimal porcentImpuesto;
	private String status;
	private String userId;
}