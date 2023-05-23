package com.vsm.lib.dto.etime; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtCiaForUserDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	EtCiaUsrPKDto id;
  	EtCiaDto etCia;
}