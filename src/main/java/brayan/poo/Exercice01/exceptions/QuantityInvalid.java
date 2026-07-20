package brayan.poo.Exercice01.exceptions;

public class QuantityInvalid extends RuntimeException {
    public QuantityInvalid(String message) {
        super("Invalid reported quantity");
    }
}
