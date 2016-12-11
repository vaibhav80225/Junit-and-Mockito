package com.wcisw.order.bo;

import java.sql.SQLException;

import com.wcisw.order.bo.exception.BOException;
import com.wcisw.order.dao.OrderDao;
import com.wcisw.order.dto.Order;

public class OrderBoImpl implements OrderBo {

	private OrderDao dao;

	@Override
	public boolean placeOrder(Order order) throws BOException {
		try {
			int result = dao.create(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean cancelOrder(int id) throws BOException {
		Order order;
		try {
			order = dao.read(id);
			order.setStatus("cancelled");
			int result = dao.update(order);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	@Override
	public boolean deleteOrder(int id) throws BOException {
		try {
			int result = dao.delete(id);
			if (result == 0) {
				return false;
			}
		} catch (SQLException e) {
			throw new BOException(e);
		}
		return true;
	}

	public OrderDao getDao() {
		return dao;
	}

	public void setDao(OrderDao dao) {
		this.dao = dao;
	}
}