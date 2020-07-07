/*
    Coder: Elvis Gene
    Date: 05-07-2020
    Description: This class is used to instantiate Sale objects.
 */

package com.furnitureapp.factory.sales;

import com.furnitureapp.entity.sales.Sale;
import com.furnitureapp.utility.Helper;

public class SaleFactory {
    public static Sale createSale(String saleTime, double totalAmount){
        int saleCode = Helper.generateCode();

        return new Sale.SaleBuilder()
                .setSaleCode(saleCode)
                .setSaleTime(saleTime)
                .setTotalAmount(totalAmount).build();
    }
}