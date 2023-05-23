package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsArgDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsArgPKDto id;
	private String actividad;
	private String afilSindical;
	private String calle;
	private BigDecimal categoriaConvenio;
	private BigDecimal celular;
	private BigDecimal clavePaisTel;
	private String codAreaTel;
	private String codPos;
	private BigDecimal codSiniestrado;
	private String condicionTrabajo;
	private BigDecimal convenio;
	private BigDecimal cuil;
	private String departamento;
	private LocalDateTime fechaMov;
	private String jurisSindical;
	private String localidad;
	private String localidadContr;
	private String modalidadContr;
	private BigDecimal numDocumento;
	private String numero;
	private BigDecimal obraSocial;
	private String otrosDatos;
	private String pais;
	private String piso;
	private BigDecimal porcentajeAdicSs;
	private String provincia;
	private String seguroVida;
	private String status;
	private String telefono;
	private String telefono2;
	private BigDecimal tipoDocumento;
	private String userId;
}