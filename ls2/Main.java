package Homeworks.ls2;
/*
Homework task Дописать третье задание таким образом, чтобы в идентификатор типа Developer записывался объект Frontender, и далее вызывался метод developGUI(),
 не изменяя существующие интерфейсы, только код основного класса.
 */

public class Main {
    public static void main(String[] args) {
        Developer developer = new FullStack();
        ((FullStack) developer).back();
        Developer frondev = new Frontender();
        ((Frontender) frondev).front();
        ((Frontender) frondev).developerGUI();
    }
}
