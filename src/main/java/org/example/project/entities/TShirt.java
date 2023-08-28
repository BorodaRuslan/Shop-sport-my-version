package org.example.project.entities;

import lombok.Builder;
import lombok.Getter;
import org.example.project.brands.BrandTShirts;
import org.example.project.brands.ColorTShirts;

@Builder(setterPrefix = "set")
@Getter
public class TShirt {
    BrandTShirts brand;
    ColorTShirts color;

}
