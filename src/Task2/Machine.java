package Task2;

public class Machine {
    private int age;
    private String color;

    // Взагалі цей конструктор створюється автоматично компілятором
   public Machine(){
        this.age = 1;
        this.color = "white";
   }
   public Machine(int  age, String color){
       this.age = age;
       this.color = color;
   }

   public Machine(int age){
       this.age = age;
       this.color = "white";
   }
}
