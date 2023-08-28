package org.example.project.orders;

import org.example.project.brands.*;
import org.example.project.entities.Cap;
import org.example.project.entities.TShirt;

public class OrderA {

    public static String getOrder(){
        Cap cap = Cap.builder()
                .setCap(BrandsCap.SMART_CAP)
                .setColor(ColorCap.WHITE).build();

        TShirt tshirt = TShirt.builder()
                .setBrand(BrandTShirts.PASSIVE_SPORT)
                .setColor(ColorTShirts.RED).build();

        int totalCost = ClothingBrandPrice.ClothingBrand.SMART_CAP.getPrice() +
                ClothingBrandPrice.ClothingBrand.PASSIVE_SPORT.getPrice();

        return "Brand cap: " + cap.getCap() + " Color cap: " +cap.getColor() + "\n"
        +"Brand T-shirt: " + tshirt.getBrand() + " Color T-shirt: " + tshirt.getColor() + "\n"
         +"Order A total cost: " + totalCost + "$";
    }
}
