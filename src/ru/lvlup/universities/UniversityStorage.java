package ru.lvlup.universities;

public class UniversityStorage {

    private final University[] universities;

    public UniversityStorage() {
        // this.universities = new University[2];
        // this.universities[0] = new University("СПбГУ", "Государственный университет", 1803)
        // this.universities[1] = new University("СПбГПУ", "Политехнический университет", 1804)
        this.universities = new University[] {
                new University("СПбГУ", "Государственный университет", 1803),
                new University("СПбГПУ", "Политехнический университет", 1804)
        };
    }

    // Проверят, есть ли такой университет в массиве
    public boolean exists(University university) {
        for (int i = 0; i < universities.length; i++) {
            if (universities[i].equals(university)) {
                return true;
            }
        }
        return false;
    }



}



