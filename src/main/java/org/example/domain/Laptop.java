package org.example.domain;

import java.util.Objects;

/**
 * Ноутбук
 */
public class Laptop {

    /**
     * Цвет
     */
    private String color;

    /**
     * Модель
     */
    private String model;

    /**
     * Цена
     */
    private float price = 5_000.00f;

    /**
     * Бренд
     */
    private String brand;

    /**
     * Конструктор всех параметров
     * @param color цвет
     * @param model модель
     * @param price цена
     * @param brand бренд
     */
    public Laptop(String color, String model, float price, String brand) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.brand = brand;
    }

    /**
     * Конструктор без цены
     * @param color цвет
     * @param model модель
     * @param brand бренд
     */
    public Laptop(String color, String model, String brand) {
        this.color = color;
        this.model = model;
        this.brand = brand;
    }

    /**
     * Получает цвет
     * @return Цвет
     */
    public String getColor() {
        return color;
    }

    /**
     * Получает модель
     * @return Модель
     */
    public String getModel() {
        return model;
    }

    /**
     * Получает цену
     * @return Цена
     */
    public float getPrice() {
        return price;
    }

    /**
     * Получает производитель
     * @return Производитель
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Меняет цену
     * @param price Новая цена
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * Сравнивает другой ноутбук с текущим
     * @param o другой ноутбук
     * @return результат сравнения
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Laptop laptop)) return false;
        return Float.compare(price, laptop.price) == 0 && Objects.equals(color, laptop.color) && Objects.equals(model, laptop.model) && Objects.equals(brand, laptop.brand);
    }

    /**
     * Уникальный индикатор класса
     * @return индикатор класса
     */
    @Override
    public int hashCode() {
        return Objects.hash(color, model, price, brand);
    }

    /**
     * Строчное представление объекта
     * @return Строчное представление объекта
     */
    @Override
    public String toString() {
        return "Laptop{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", brand='" + brand + '\'' +
                '}';
    }
}
