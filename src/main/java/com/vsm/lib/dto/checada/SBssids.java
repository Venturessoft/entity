package com.vsm.lib.dto.checada; 
 
import java.io.Serializable;
import java.util.List;
import java.util.Map;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SBssids implements Serializable { 
	private static final long serialVersionUID = 1L; 

	List<Map <String,String>> bssids;
}