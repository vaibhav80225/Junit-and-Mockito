package com.wcisw.order.bo;

import com.wcisw.order.bo.exception.BOException;
import com.wcisw.order.dto.Order;

public interface OrderBo {
	boolean placeOrder(Order order) throws BOException;

	boolean cancelOrder(int id) throws BOException;

	boolean deleteOrder(int id) throws BOException;

}
