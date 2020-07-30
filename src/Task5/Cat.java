package Task5;

class Cat {
    String name;
    int age;
    String color;
    Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return  "Name: " + name + ", Age: " + age + ", Color: " + color;
    }
}