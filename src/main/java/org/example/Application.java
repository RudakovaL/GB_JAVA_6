package org.example;

import org.example.domain.Laptop;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("черный", "А-50", "самсунг"));
        laptops.add(new Laptop("красный", "А-50", 4700f, "самсунг"));
        laptops.add(new Laptop("красный", "А-52", 5600f, "макбук"));
        laptops.add(new Laptop("синий", "А-51", 4000f, "леново"));

        List<Laptop> samsungs = laptops.stream().filter(f -> f.getBrand().equals("самсунг")).toList();
        System.out.println(samsungs);
        List<Laptop> less500 = laptops.stream().filter(f -> f.getPrice() <= 5000f).toList();
        System.out.println(less500);

    }
}
