package enums;

public enum Person {

    ADMIN(1),
    WAITER(2),
    CLIENT(3);


    private final int index;

    Person(int index) {
        this.index = index;
    }


    public static void showAllTypes() {
        var personType = Person.values();
        for (Person person : personType) {
            System.out.println(person.index + " " + person.name());
        }
    }

    public static Person getByIndex(int index) {
        var personType = Person.values();
        for (Person person: personType) {
            if (person.index == index) {
                return person;
            }
        }
        return null;
    }
}
