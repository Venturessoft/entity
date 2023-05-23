package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtDatosFactDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long idFacturacion;
	private String calle;
	private String ciudad;
	private String codTelefono;
	private String colonia;
	private String correo;
	private String cvePais;
	private String estado;
	private String estatus;
	private BigDecimal idCia;
	private String numExterior;
	private String numInterior;
	private String razonSocial;
	private String rfc;
	private BigDecimal telefono;
}