/*
    Coder: Elvis Gene
    Date: 05-07-2020
    Description: Tests of the SaleProductFactory class methods
 */

package com.furnitureapp.factory.sales;

import com.furnitureapp.entity.sales.SaleProduct;
import com.furnitureapp.utility.Helper;
import org.junit.Assert;
import org.junit.Test;

public class SaleProductFactoryTest {

    @Test
    public void createSaleProduct(){
        SaleProduct saleProduct = SaleProductFactory.createSaleProduct(1, 2, 3);
        Assert.assertNotNull(saleProduct);
    }
}
