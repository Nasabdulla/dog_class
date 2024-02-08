class Dog {
  int age;
  String name;
  String breed;
  
  public Dog (String dogName, int dogAge, String dogbreed){
  age = dogAge;
  name = dogName;
  breed = dogbreed;
  }
  public void bark(){
  System.out.println("Woof! Woof!");
  }
  
  public String getAgeCategory(){
    if (age <= 1){
      return "puppy";
    }else if (age > 1 && age < 4 ){
      return "Young";
    }else if (age >= 4 && age < 10){
      return "Adult";
    }else {
      return "elderly";
    }
  }
  
  public int getAge() {
  return age;
  }
  public String getName() {
  return name;
  }
  public int getAgeinHumanYears(){
    if (age == 1){
      return 15;
    }else if (age== 2){
      return 24;
    }else {
      return 24+age*5;
    }
  }

public String toString(){
  return name +" is a " + age + " year old " + breed +" " + getAgeCategory() + " who is " + getAgeinHumanYears() + " Year old in human years";
  
}

  
  }
public class Main {
  public static void main(String[] args) {

    Dog d1 = new Dog("Spike", 4, "Labrador");
    Dog d2 = new Dog("Max", 1, "Chihuahua");
    Dog d3 = new Dog("Bolt", 2, "Corgi");
    Dog d4 = new Dog("alvin", 7, "bulldog");
    
    System.out.println(d1);
    System.out.println(d2);
    System.out.println(d3);
    System.out.println(d4);
    
  }
}