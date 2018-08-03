package com.atos.hibernate.modelo;

import java.util.List;

import com.atos.hibernate.Articulos;

public interface IGestion_Articulos {

	Articulos consultar_PorCodigo(Integer clave_articulo);

	List<Articulos> consultar_Todos();

	void alta_Articulo(Articulos articulo) throws Exception;

	void baja_Articulo(Articulos articulo) throws Exception;

	void modificacion_Articulo(Articulos articulo) throws Exception;

}