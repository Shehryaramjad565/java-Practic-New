package Day4;


class Person {
    String name;
    int age;

    // Normal constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person otherPerson) {
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void CopyConstructor(String[] args) {
        Person p1 = new Person("Alice", 25); // Original object
        p1.display();

        Person p2 = new Person(p1); // Copying p1 using copy constructor
        p2.display();
    }
}



