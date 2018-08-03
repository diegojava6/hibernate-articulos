package com.atos.hibernate.modelo;

import java.util.List;

import org.hibernate.Transaction;

import com.atos.hibernate.Articulos;
import com.atos.hibernate.dao.ArticulosDAO;

public class Gestion_Articulos implements IGestion_Articulos {

	private ArticulosDAO articulos_dao;

	public Gestion_Articulos() {
		articulos_dao = new ArticulosDAO();
	}

	@Override
	public Articulos consultar_PorCodigo(Integer clave_articulo) {
		Articulos articulo_buscado = articulos_dao.findById(clave_articulo);
		articulos_dao.getSession().close();
		return articulo_buscado;
	}

	@Override
	public List<Articulos> consultar_Todos() {
		List<Articulos> lista_articulos = articulos_dao.findAll();
		articulos_dao.getSession().close();
		return lista_articulos;
	}

	@Override
	public void alta_Articulo(Articulos articulo) throws Exception {
		Transaction tran = articulos_dao.getSession().beginTransaction();
		try {
			articulos_dao.save(articulo);
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
		}
		articulos_dao.getSession().close();
	}

	@Override
	public void baja_Articulo(Articulos articulo) throws Exception {
		Transaction tran = articulos_dao.getSession().beginTransaction();
		try {
			articulos_dao.delete(articulo);
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
		}
		articulos_dao.getSession().close();
	}

	@Override
	public void modificacion_Articulo(Articulos articulo) throws Exception {
		Transaction tran = articulos_dao.getSession().beginTransaction();
		try {
			articulos_dao.attachDirty(articulo);
			tran.commit();
		} catch (Exception e) {
			tran.rollback();
		}
		articulos_dao.getSession().close();
	}

}
