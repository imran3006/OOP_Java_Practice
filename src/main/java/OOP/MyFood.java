package OOP;
//Abstract class and method. each child class is inherit parent abstract class and replace the their body with abstract methos an
//do their task
public class MyFood {
    public static void main(String[] args) {
        Food b=new Biriyani();
        b.cookFood();
        Food p=new Polao();
        p.cookFood();
    }
}
abstract class Food{
    abstract void cookFood();
}
class Biriyani extends Food{
    void cookFood(){
        System.out.println("Biriyani is cooking");
    }
}
class Polao extends Food{
    void cookFood(){
        System.out.println("Polao is cooking");
    }
}
class Tehari extends Food{
    void cookFood(){
        System.out.println("Tehari is cooking");
    }
}
