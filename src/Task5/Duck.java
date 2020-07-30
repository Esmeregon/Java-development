package Task5;

class Duck {
    String name;
    int age;
    String sex;
    Duck(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Sex: " + sex;
    }
}