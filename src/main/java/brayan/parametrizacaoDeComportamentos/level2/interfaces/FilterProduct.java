package brayan.parametrizacaoDeComportamentos.level2.interfaces;

import brayan.parametrizacaoDeComportamentos.level2.domain.Product;

public interface FilterProduct {
    boolean test(Product product);
}
