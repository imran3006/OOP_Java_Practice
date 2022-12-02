package OOP;
//overloading example
// method name same but parameter different.
public class mySalary {
    public int getSalary(int hour){
        return hour*500;
    }
    public int getSalary(int hour, int overtime){
        return (hour*500)+(overtime*700);
    }
    public static void main(String[] args) {
        mySalary rafiq=new mySalary();
        int salary= rafiq.getSalary(8, 2);// overloading the single parameterised method
        System.out.println(salary);
    }

}
