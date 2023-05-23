package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtUsuarioCiaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

  private long idUsuario;
  private String apMaterno;
  private String apPaterno;  
  private String aviso;
  private String codTelefono;  
  private String correo;  
  private String estacion;  
  private String estatus;
  private BigDecimal idRol;  
  private String nombre;  
  private String password;  
  private BigDecimal telefono;
  private EtCiaUsrDto etCiaUsr;
}