package com.example.aluraviagens.util;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formataDiasEmTexto(int quantidadeDeDias) {
        if (quantidadeDeDias > 1) {
            return quantidadeDeDias + PLURAL;
        } else {
            return quantidadeDeDias + SINGULAR;
        }
    }
}
