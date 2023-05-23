package com.vsm.lib.dto.human; 
 
import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuEmplsAsistenciaDto implements Serializable { 
	private static final long serialVersionUID = 1L; 

	private HuEmplsAsistenciaPKDto id;
	private String asMes01;
	private String asMes02;
	private String asMes03;
	private String asMes04;
	private String asMes05;
	private String asMes06;
	private String asMes07;
	private String asMes08;
	private String asMes09;
	private String asMes10;
	private String asMes11;
	private String asMes12;
}