package com.cj.Service;

import com.cj.model.Orders;

import java.util.List;

public interface OrdersService {

    List<Orders> selectByUId(Integer uid);
}
