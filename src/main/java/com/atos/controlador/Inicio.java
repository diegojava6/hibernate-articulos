package com.atos.controlador;

import java.util.List;

import com.atos.hibernate.Articulos;
import com.atos.hibernate.modelo.Gestion_Articulos;
import com.atos.hibernate.modelo.IGestion_Articulos;

public class Inicio {

	public static void main(String[] args) {
		IGestion_Articulos gestion_articulos = new Gestion_Articulos();

		Articulos articulo = gestion_articulos.consultar_PorCodigo(new Integer(104));
		articulo = gestion_articulos.consultar_PorCodigo(new Integer(999));

		List<Articulos> lista = gestion_articulos.consultar_Todos();

		Articulos articulo_nuevo = new Articulos();
		articulo_nuevo.setCantidad(new Integer(50));
//		articulo_nuevo.setCodigoArticulo(new Integer(999));
		articulo_nuevo.setDescripcionArticulo("Articulo de prueba");
		articulo_nuevo.setPrecioUnidadArticulo(new Double(20.35));

		try {
			gestion_articulos.alta_Articulo(articulo_nuevo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		articulo_nuevo.setPrecioUnidadArticulo(new Double(50.25));
		articulo_nuevo.setDescripcionArticulo("descripcion cambiada");

		try {
			gestion_articulos.modificacion_Articulo(articulo_nuevo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			gestion_articulos.baja_Articulo(articulo_nuevo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
