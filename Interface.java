interface Animal {
    void sound();
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
    }
}
