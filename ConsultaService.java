package com.seguros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.seguros.beans.DatosBean;
import com.seguros.beans.RequesBean;
import com.seguros.controller.ConsultaInfoController;

@RestController
@RequestMapping("/consulta")
public class ConsultaService {



	@RequestMapping(value = "/infoPedido", method = RequestMethod.POST)
	public List<DatosBean> ejemplo(@RequestBody RequesBean request) {
		List<DatosBean> response = new ArrayList<DatosBean>();
		ConsultaInfoController consulta = new ConsultaInfoController();
		
		System.out.println("Iniciando busqueda de información");
		
		System.out.println("Canal "+request.getCanal());
		System.out.println("Pais "+request.getPais());
		System.out.println("Sucursal "+request.getSucursal());
		System.out.println("Folio "+ request.getFolio());
		
		response = consulta.consultaInfo(request);

		return response;
	}
}
