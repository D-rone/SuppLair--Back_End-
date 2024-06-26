package com.esisba.msqueryproducts.documents;

import com.esisba.productscoreapi.embedded.Discount;
import org.springframework.data.rest.core.config.Projection;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Projection(name = "" , types = Product.class)
public interface ProductProjectionB {

    List<String> getImagePaths();

    String getProductId();
    String getName();
    double getPrice();
    float getRate();
    int getNumberOfRates();
    String getDescription();
    int getQuantity();
    int getMinimumQuantity();
    String getReference();

    LocalDateTime getCreatedAt();

    Discount getDiscount();

}
