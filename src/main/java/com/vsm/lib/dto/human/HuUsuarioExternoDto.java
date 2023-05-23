package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuUsuarioExternoDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long userSkey;
	private String apellMat;
	private String apellPat;
	private String claveId;
	private BigDecimal domClavePaisTel;
	private BigDecimal domCodAreaTel;
	private BigDecimal domTel;
	private String domicilio;
	private String email;
	private LocalDateTime fechaMov;
	private BigDecimal nip;
	private String nombre;
	private BigDecimal ofClavePaisTel;
	private BigDecimal ofCodAreaTel;
	private BigDecimal ofExtTel;
	private BigDecimal ofTel;
	private String status;
	private String supervisor;
	private String userId;
}