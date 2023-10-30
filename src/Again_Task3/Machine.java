package Again_Task3;

public class Machine {
  private int age;
  private double speed;
  private int weight;
  private String color;

  public Machine(){
      this.age = 1;
      this.speed = 250.5;
      this.weight = 700;
      this.color = "white";
  }

  public Machine(int age){
      this.age = age;
      this.speed = 250.5;
      this.weight = 700;
      this.color = "white";
  }

    public Machine(int age, double speed){
        this.age = age;
        this.speed = speed;
        this.weight = 700;
        this.color = "white";
    }

    public Machine(int age, double speed, int weight){
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = "white";
    }

    public Machine(int age, double speed, int weight, String color){
        this.age = age;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
