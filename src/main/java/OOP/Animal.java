package OOP;
// ex of inheritance
public class Animal {
    public void talk(){
        System.out.println("Animal can't talk");
    }
    public void breeds(){
        System.out.println("Animal can breeds");
    }

    public static void main(String[] args) {
        Bird sparrow=new Bird();
        sparrow.talk();
        Parrot parrot=new Parrot(); //
        parrot.talk();// method overriding chaild class er properties diye parent class er properties replace hoye jabe
        Bird mayna=new Mayna();
        mayna.talk();
    }
}
class Bird extends Animal{
    public void talk(){
        System.out.println("Bird can't talk");
    }
}
class Parrot extends Bird{
    public void talk(){
        System.out.println("Parrot can talk");
    }
}
class Mayna extends Bird{
    public void talk(){
        System.out.println("Mayna can also talk");
    }


}
