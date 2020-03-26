package com.bolsasideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServiciosSimple")
public class MiServicios implements IServicio {

	@Override
	public String operacion() {
		return "ejecutando algun proceo imporante simple...";
	}

	
	
}
