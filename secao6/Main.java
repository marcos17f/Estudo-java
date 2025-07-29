package secao6;

public class Main {
    public static void main(String[] args) {
        var male = new Person();
        male.setName("Marcos");
        male.setAge(28);

        var female = new Person();
        female.setName("Felipe");
        female.setAge(18);
        System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
        System.out.println("Female name: " + female.getName() + " age: " + female.getAge());

    }
}