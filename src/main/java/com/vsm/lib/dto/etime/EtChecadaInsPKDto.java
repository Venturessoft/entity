package com.vsm.lib.dto.etime;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtChecadaInsPKDto {
	private long idChecada;
	private long idCia;
	private long idEmpleado;
	private long idEstacion;
	private LocalDateTime fecha;
	private String tipo;
}