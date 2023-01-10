package day44_Abstraction.Animal;

public interface Flyable {
    boolean canfly = true;   // every interface variable static ve finaldir

    // statik block acamiyoruz
    // public static method acabilir static veriable i kullanabiliriz
    void fly(); // abstract yazmasask da aslinda abstract tir
}
