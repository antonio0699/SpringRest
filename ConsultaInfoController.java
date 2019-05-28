package com.seguros.controller;

import java.util.ArrayList;
import java.util.List;

import com.seguros.beans.DatosBean;
import com.seguros.beans.RequesBean;
import com.seguros.dao.ConsultaDao;

public class ConsultaInfoController {
	
	
	public List<DatosBean> consultaInfo(RequesBean datos) {
		ConsultaDao consulta = new ConsultaDao();
		List<DatosBean> Bdatos = new ArrayList<>();
		
		//Busca Información de los datos..
		
		Bdatos = consulta.consultaDao(datos);
		
		
	    if(!Bdatos.isEmpty()) {
	    System.out.println("Llego con datos");
	     return Bdatos;	
	    }else {
	
	    DatosBean Edatos = new DatosBean();
	   
	    }
		
		
		
		
		return Bdatos;
	}

}
