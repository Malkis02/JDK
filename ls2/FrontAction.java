package Homeworks.ls2;

public interface FrontAction {
    void front();
    default void cofee() {
        System.out.println("Drink");
    };
}
