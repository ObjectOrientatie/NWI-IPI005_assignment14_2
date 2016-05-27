package ackermann;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/**
 *
 * @author Hendrik Werner // s4549775
 */
public class Ackermann {

    private final IntegerProperty m;
    private final IntegerProperty n;

    public Ackermann() {
        this.m = new SimpleIntegerProperty();
        this.n = new SimpleIntegerProperty();
    }

    public void startCalculation() {
        // TODO
    }

    public void stopCalculation() {
        // TODO
    }

    /**
     * @return the m
     */
    public IntegerProperty mProperty() {
        return m;
    }

    /**
     * @return the n
     */
    public IntegerProperty nProperty() {
        return n;
    }

}