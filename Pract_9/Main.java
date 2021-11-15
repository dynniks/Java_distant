package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String mercury = new String("Меркурий");
        String venus = new String("Венера");
        String earth = new String("Земля");
        String mars = new String("Марс");
        String jupiter = new String("Юпитер");
        Random random = new Random();
        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars, jupiter)));
        ArrayList<String> solarSystem1 = new ArrayList<>(Arrays.asList(mercury, venus, earth));
        ArrayList<String> solarSystem2 = new ArrayList<>(Arrays.asList(mars, jupiter, earth));
        System.out.println(solarSystem);
        solarSystem1.add(mars);
        solarSystem2.remove(2);
        solarSystem1.set(2, mercury);
        System.out.println(solarSystem1);
        System.out.println(solarSystem1.get(random.nextInt(3)));
        System.out.println(solarSystem2.contains(jupiter));
        Collections.shuffle(solarSystem2);
        System.out.println(solarSystem1.indexOf(venus));
        //Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(jupiter));
        //Collections.sort(solarSystem);
        //Collections.reverse(solarSystem);
        //System.out.println(Collections.disjoint(solarSystem1, solarSystem2));
    }
}
