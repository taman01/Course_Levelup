package ru.lvlup.universities;

import java.util.Objects;

public class University {

    private final String shortName;
    private final String name;
    private final int foundationYear;

    public University(String shortName, String name, int foundationYear) {
        this.shortName = shortName;
        this.name = name;
        this.foundationYear = foundationYear;
    }

    @Override
    public boolean equals(Object o) {
        // u2 - this
        // u3 - argument (o)
        if (this == o) return true;

        // 1 var
        // instanceof
        // <object> instanceof <Class>
        // o instanceof University -> true/false
        // null instanceof University -> false
        // if (!(o instanceof University)) return false;

        // 2 var
        if (o == null || getClass() != o.getClass()) return false;

        University other = (University) o;
        // University other = (University) null;
        // if (... && ... && ...)
        return foundationYear == other.foundationYear &&
                Objects.equals(shortName, other.shortName) &&
                Objects.equals(name, other.name);
//                shortName.equals(other.shortName) &&
//                name.equals(other.name);
    }

    // boolean equals(University u1, University u2)
    // u1.equals(u1, u2) -> u1.equals(u2)

    // String number;
    // void receiveCall(String income) {
    //     System.out.println("На номер " + number + " звонят с номера " + income);
    // }
    // Phone p = new Phone("435345"); p.receiveCall("675665");

    @Override
    public int hashCode() {
        // int result = 17;
        // result = 31 * result + shortName.hashCode();
        // result = 31 * result + name.hashCode();
        // result = 31 * result + foundationYear;
        // return result;
        // Object[] objects = new Object[] {
        //        shortName, name, foundationYear
        // };
        // return Objects.hash(objects);
        return Objects.hash(name, shortName, foundationYear);
    }

}



