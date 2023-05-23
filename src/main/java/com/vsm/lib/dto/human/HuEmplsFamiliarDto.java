package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsFamiliarDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	HuEmplsFamiliarPKDto id;
	String apellMat;
	String apellPat;
	String avisarAccidente;
	String banco;
	BigDecimal claveNivelEsc;
	BigDecimal clavePaisTel;
	String claveProfesion;
	BigDecimal codAreaTel;
	BigDecimal conceptoPensionFa;
	String ctaDeud;
	String cuenta;
	String cuentaContable;
	String cuentaValComedor;
	String cuentaValGasolina;
	String cuentaVales;
	String discapacitado;
	String estadoCivil;
	LocalDateTime fechaMov;
	LocalDateTime fechaNac;
	String formaPago;
	BigDecimal gpoConceptoBen;
	String juzgadoCivil;
	String lugarPago;
	String nombre;
	String numOficio;
	String parentesco;
	BigDecimal porc1;
	BigDecimal porc2;
	BigDecimal porc3;
	BigDecimal porcentPensionFa;
	String seguroMedico;
	String sexo;
	String status;
	String statusDependEco;
	String sucursal;
	String tarjetaValComedor;
	String tarjetaValGasolina;
	String tarjetaVales;
	String telefonoCasa;
	String telefonoRecado;
	String userId;
	
	String descNivelEsc;
}