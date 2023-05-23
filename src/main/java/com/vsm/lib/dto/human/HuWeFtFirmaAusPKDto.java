package com.vsm.lib.dto.human;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HuWeFtFirmaAusPKDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private long numCia;
	private long numEmp;
	private long orden;
	private long folioSolicitud;
}