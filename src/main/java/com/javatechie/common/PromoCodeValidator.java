package com.javatechie.common;

import com.javatechie.exception.InvalidPromoCodeException;

import java.util.Arrays;
import java.util.List;

public class PromoCodeValidator {

    public static void validatePromoCode(String promoCode) {
        List<String> promoCodes = Arrays.asList("gc34367", "8478fdh", "8732v47");
        if (!promoCodes.contains(promoCode)) {
            throw new InvalidPromoCodeException("INVALID PROMO CODE ! Please validate before apply");
        }
    }
}
