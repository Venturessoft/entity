package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuAuditoriaDto implements Serializable {	
	private static final long serialVersionUID = 1L;

	HuAuditoriaPKDto id;
}