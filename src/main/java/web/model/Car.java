package web.model;

import java.util.Objects;

public class Car {
    private int count;
    private String model;
    private String color;
    private int win;

    public Car(int count, String model, String color, int win) {
        this.count = count;
        this.model = model;
        this.color = color;
        this.win = win;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return win == car.win;
    }

    @Override
    public int hashCode() {
        return Objects.hash(win);
    }
}
