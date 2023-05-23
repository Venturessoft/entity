package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VaPKDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private long vaCia;
	private long vaNumEmp;
	private long vaAaProc;
	private long vaSecSal;
}