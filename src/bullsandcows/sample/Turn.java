package bullsandcows.sample;

import javafx.beans.property.SimpleIntegerProperty;

public class Turn {
    private SimpleIntegerProperty nr = new SimpleIntegerProperty();
    private SimpleIntegerProperty n1 = new SimpleIntegerProperty();
    private SimpleIntegerProperty n2 = new SimpleIntegerProperty();
    private SimpleIntegerProperty n3 = new SimpleIntegerProperty();
    private SimpleIntegerProperty n4 = new SimpleIntegerProperty();
    private SimpleIntegerProperty cows = new SimpleIntegerProperty();
    private SimpleIntegerProperty bulls = new SimpleIntegerProperty();

    public int getNr() {
        return nr.get();
    }

    public SimpleIntegerProperty nrProperty() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr.set(nr);
    }

    public int getN1() {
        return n1.get();
    }

    public SimpleIntegerProperty n1Property() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1.set(n1);
    }

    public int getN2() {
        return n2.get();
    }

    public SimpleIntegerProperty n2Property() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2.set(n2);
    }

    public int getN3() {
        return n3.get();
    }

    public SimpleIntegerProperty n3Property() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3.set(n3);
    }

    public int getN4() {
        return n4.get();
    }

    public SimpleIntegerProperty n4Property() {
        return n4;
    }

    public void setN4(int n4) {
        this.n4.set(n4);
    }

    public int getCows() {
        return cows.get();
    }

    public SimpleIntegerProperty cowsProperty() {
        return cows;
    }

    public void setCows(int cows) {
        this.cows.set(cows);
    }

    public int getBulls() {
        return bulls.get();
    }

    public SimpleIntegerProperty bullsProperty() {
        return bulls;
    }

    public void setBulls(int bulls) {
        this.bulls.set(bulls);
    }
}
