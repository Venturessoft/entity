package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuSolEmpInicialDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuSolEmpInicialPKDto id;
	private String apellMat;
	private String apellPat;
	private String bolsa;
	private BigDecimal clavePaisTel;
	private String clavePuesto;
	private BigDecimal codAreaTel;
	private String email;
	private LocalDateTime fechaMov;
	private LocalDateTime fechaSol;
	private BigDecimal folioReq;
	private BigDecimal idCandidato;
	private String nombre;
	private BigDecimal numCiaEmp;
	private BigDecimal numCiaReq;
	private BigDecimal numEmp;
	private String status;
	private String statusCv;
	private String telefono;
	private String telefonoCel;
	private String userId;
}