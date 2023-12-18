package com.example.layeredarchitecture.dao.custom.impl;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.dao.custom.PlaceOrderDAO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.SQLException;

public class PlaceOrderDAOImpl implements PlaceOrderDAO {
    @Override
    public boolean saveOrderDetails(OrderDetailDTO dto) throws SQLException, ClassNotFoundException {
       /* Connection connection= DBConnection.getDbConnection().getConnection();
        PreparedStatement stm = ((Connection) connection).prepareStatement("INSERT INTO OrderDetails (oid, itemCode, unitPrice, qty) VALUES (?,?,?,?)");
        //stm.setString(1, dto.getOrderId());
        stm.setString(2, dto.getItemCode());
        stm.setBigDecimal(3, dto.getUnitPrice());
        stm.setInt(4, dto.getQty());
        return stm.executeUpdate()>0;*/

        return SQLUtil.execute("INSERT INTO OrderDetails VALUES (?,?,?,?)",
                dto.getOrderId(),
                dto.getItemCode(),
                dto.getQty(),
                dto.getUnitPrice());

    }
}