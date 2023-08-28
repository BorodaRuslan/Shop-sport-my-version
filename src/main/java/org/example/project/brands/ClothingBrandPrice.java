package org.example.project.brands;

import lombok.Getter;

public class ClothingBrandPrice {
    @Getter
    public enum ClothingBrand{
        ACTIVE_SPORT(22),
        PASSIVE_SPORT(10),
        SMART_CAP(9),
        ABIBAS(15),
        BARABASHOVA_STYLE(23);

        private final int price;
        ClothingBrand(int price) {
        this.price = price;

        }
    }
}
