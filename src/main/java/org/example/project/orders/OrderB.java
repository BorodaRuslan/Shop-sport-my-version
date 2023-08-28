package org.example.project.orders;


import org.example.project.brands.*;
import org.example.project.entities.Cap;
import org.example.project.entities.TShirt;

public class OrderB {

    public static String getOrder(){
        Cap cap = Cap.builder()
                .setCap(BrandsCap.SMART_CAP)
                .setColor(ColorCap.BLACK).build();

        TShirt tshirt = TShirt.builder()
                .setBrand(BrandTShirts.ACTIVE_SPORT)
                .setColor(ColorTShirts.BLUE).build();

        int totalCost = ClothingBrandPrice.ClothingBrand.ACTIVE_SPORT.getPrice() +
                ClothingBrandPrice.ClothingBrand.SMART_CAP.getPrice();

        return "Brand cap: " + cap.getCap() + " Color cap: " +cap.getColor() + "\n"
                + "Brand T-shirt: " + tshirt.getBrand() + " Color T-shirt: " + tshirt.getColor() + "\n"
                + "Order B total cost: " + totalCost + "$";
    }

}
