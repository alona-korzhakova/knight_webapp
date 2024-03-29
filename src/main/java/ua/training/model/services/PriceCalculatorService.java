/*
 * PriceCalculatorService
 *
 * Description: This source file is a part of the Knight web app.
 *
 * By: Alyona Korzhakova
 *
 * Created: 2018/04/10
 *
 * Updated: 2018/04/20
 */
package ua.training.model.services;

import ua.training.model.entity.Product;

import java.util.List;

public class PriceCalculatorService {

    /**
     * Calculates a total order price.
     * @param products
     * @return total price in long
     */
    public long calculatePrice(List<Product> products) {

        long price = 0;

        for (Product product : products) {
            price += product.getPrice();
        }
        return price;
    }
}
