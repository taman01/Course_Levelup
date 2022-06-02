package ru.lvlup.lesson6;

import ru.lvlup.universities.University;

@SuppressWarnings("ALL")
public class Comparison {

    public static void main(String[] args) {
        University u1 = new University("СПбГУ", "Государственный университет", 1803);
        University u2 = new University("СПбГПУ", "Политехнический университет", 1804);
        University u3 = new University("СПбГПУ", "Политехнический университет", 1804);
        University u4 = u2;

        int i1 = 123;
        int i2 = 123;



        boolean areEquals = i1 == i2;           // -> true
        boolean areObjectEquals = u2 == u3;     // -> false
        boolean areReferencesEquals = u2 == u4; // -> true

        // u2.equals(u3) -> u2 vs u3
        boolean objectComparison = u2.equals(u3);   // -> false
        // u3.equals(u2) ->
        System.out.println("Comparison: " + objectComparison);

        // University u5 = null;
        // u2.equals(null);
        // u2.equals(u5);

        // University u6 = new Univerisity(null, null, 205);
        // u6.equals(u3);

        // Shape s = new Shape();
        // u2.equals(s);

    }


}
