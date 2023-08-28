package org.example.project.entities;

import lombok.Builder;
import lombok.Getter;
import org.example.project.brands.BrandsCap;
import org.example.project.brands.ColorCap;

@Builder(setterPrefix = "set")
@Getter
public class Cap {
    BrandsCap cap;
    ColorCap color;
}
