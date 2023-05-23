package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplPKDto id;
	private BigDecimal actividad;
	private String apellMat;
	private String apellPat;
	private String area;
	private String banco;
	private String banco2;
	private String cdBanco;
	private String centro;
	private String claveLocalidad;
	private BigDecimal clavePaisTel;
	private String claveProvincia;
	private BigDecimal codAreaTel;
	private String codId01;
	private String codId02;
	private String codId03;
	private String codId04;
	private String codId05;
	private String codId06;
	private String codId07;
	private String codId08;
	private String codId09;
	private String codId10;
	private String codId11;
	private String codId12;
	private String codId13;
	private String codId14;
	private String codId15;
	private String codId16;
	private String codId17;
	private String codId18;
	private String codId19;
	private String codId20;
	private String codId21;
	private String codId22;
	private String codId23;
	private String codId24;
	private String codId25;
	private String codId26;
	private String codId27;
	private String codId28;
	private String codId29;
	private String codId30;
	private BigDecimal contrato;
	private String ctaDeud;
	private String ctaDeud2;
	private String cuenta;
	private String cuentaClave;
	private String cuentaVales;
	private String cuentaValesComedor;
	private String cuentaValesGasolina;
	private String cuenta2;
	private String declaracionImp;
	private String edoBanco;
	private String email;
	private String estadoCivil;
	private BigDecimal estatura;
	private BigDecimal extensionTel;
	private LocalDateTime fechaAntiguedad;
	private LocalDateTime fechaAntiguedadSub;
	private LocalDateTime fechaBaja;
	private LocalDateTime fechaContrato;
	private LocalDateTime fechaIngreso;
	private LocalDateTime fechaMerito;
	private LocalDateTime fechaNac;
	private LocalDateTime fechaPromocion;
	private LocalDateTime fechaSueldo;
	private LocalDateTime fechaTerminacion;
	private String formaPago;
	private String formatoSueldo;
	private String gpoSanguineo;
	private String grupoPrestacion;
	private String grupoPrestacionSub;
	private BigDecimal jornadaRed;
	private String licencia;
	private String linea;
	private String localidadNac;
	private String lugarPago;
	private String moneda;
	private String nacionalidad;
	private BigDecimal nip;
	private String nombre;
	private String paisNac;
	private String pasaporte;
	private BigDecimal peso;
	private BigDecimal plaza;
	private String provinciaNac;
	private String puesto;
	private String sexo;
	private String status;
	private String sucursal;
	private String sucursal2;
	private BigDecimal sueldo;
	private String supervisor;
	private String tarjetaVal;
	private String tarjetaValComedor;
	private String tarjetaValGasolina;
	private BigDecimal telefono;
	private String tipoContrato;
	private String tipoCuenta;
	private String tipoCuenta2;
	private String tipoEmpl;
	private String tipoLicencia;
	private BigDecimal turno;
	private LocalDateTime venceLicencia;
	private LocalDateTime vencePasaporte;
	private BigDecimal zona;
	String cveEtime;
}