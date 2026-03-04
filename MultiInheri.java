public class MultiInheri {

    public static void main(String[] args) {

        Person obj = new Person();

        obj.write();
        obj.speak();
    }
}


interface Writer {
    void write();
}

interface Speaker {
    void speak();
}
class Person implements Writer, Speaker {

    public void write() {
        System.out.println("Person is writing an article.");
    }

    public void speak() {
        System.out.println("Person is giving a speech.");
    }
}

