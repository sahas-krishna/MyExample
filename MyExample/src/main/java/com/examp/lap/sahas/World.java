package com.examp.lap.sahas;

import org.joda.time.LocalTime;

public class World {
    public static void main(final String arg[]) {
        final LocalTime lt = new LocalTime();
        System.out.println(lt);
        final World1 ob = new World1();
        System.out.println(ob.sayHai());
    }
}
