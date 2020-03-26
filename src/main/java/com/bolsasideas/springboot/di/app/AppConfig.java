package com.bolsasideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsasideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsasideas.springboot.di.app.models.domain.Producto;
import com.bolsasideas.springboot.di.app.models.service.IServicio;
import com.bolsasideas.springboot.di.app.models.service.MiServicioComplejo;
import com.bolsasideas.springboot.di.app.models.service.MiServicios;

@Configuration
public class AppConfig {

	@Bean("miServicioSimple")
	public IServicio registrarMiServicio() {
		return new MiServicios();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara sony",100);
		Producto producto2 = new Producto("bici Bianchi",200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
		
	}
	
	@Bean("itemsFacturaOficina")
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Monitor LG LCD 24",250);
		Producto producto2 = new Producto("Notebook asus",500);
		Producto producto3 = new Producto("impresora",500);
		Producto producto4 = new Producto("Escritorio oficina",300);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
		
	}
	
}

