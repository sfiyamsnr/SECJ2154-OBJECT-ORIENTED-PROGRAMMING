// Safiya Nursyahadah binti Masnoor
// A23CS0176

// Question 1 : Class and Object creation

public class Main {
    public static void main(String[] args) {
        // Question 1
        Employee e1 = new Employee();
        e1.setEmpNum(101);
        e1.setEmpName("Ali");
        System.out.println("Employee Number: " + e1.getEmpNum());
        System.out.println("Employee Name: " + e1.getEmpName());

        //Question 2
        Book b1 = new Book("Java 101", "John Doe");
        b1.display();

        //Question 6
        new User();
        new User();
        System.out.println("Total Users: " + User.getUserCount());

        //Question 7
         Employee e = new Employee();
        e.setSalary(5000);
        System.out.println("Salary: " + e.getSalary());
    }
}

class Employee {
  // TODO: Add fields
  private int EmpNum;
  private String EmpName;

  //TODO: Add setter and getter methods
  public void setEmpNum (int num){
    EmpNum = num;
  } 
  public void setEmpName (String name){
    EmpName = name;
  }
  public int getEmpNum(){
    return EmpNum;
  }
  public String getEmpName(){
    return EmpName;
  }
  // Question 7 : Access Modifiers
    // TODO: Make salary private
    private int salary;
    // TODO: Write setSalary() and getSalary() methods
    public void setSalary(int s){
      salary = s;
    }
    public int getSalary(){
      return salary;
    }
}

// Question 2 : Instance Variables and Data Fields

class Car {
    // TODO: Declare two private instance variables (brand and year)
    private String brand;
    private int year;
    // TODO: Create setter for brand
    public void setBrand(String b){
      brand = b;
    }
    // TODO: Create getter for year
    public int getYear(){
      return year;
    }
}

// Question 3 : Constructor Usage
class Book {
    private String title;
    private String author;

    // TODO: Add a constructor
    public Book(String t, String a){
      title = t;
      author = a; 
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Question 4 : Getters and Setters

class Student {
    private String name;
    private int age;

    // TODO: Implement setter for name
    public void setName(String n){
      name = n;
    }
    // TODO: Implement getter for age
    public int getAge(){
      return age;
    }
}

// Question 5 : Method Overloading

class Message {
    // TODO: Write a method display() that prints "Hello!"
    public void display(){
      System.out.println("Hello");
    }
    // TODO: Overload display(String msg) to print "Message: msg"
    public void display(String msg){
      System.out.println("Message:" + msg);
    }
}

// Question 6 : Static vs Non-Static

class User {
    // TODO: Declare a static counter variable
    private static int counter = 0;
    public User() {
        // TODO: Increment counter
        counter++;
    }

    public static int getUserCount() {
        // TODO: Return counter
      return counter;
    }
}
