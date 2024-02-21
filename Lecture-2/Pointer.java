class Student {
  String name;
  int rollNo;
}

public class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.name = "Alice";
    student1.rollNo = 123;

    Student student2 = student1; // Reference copy, both point to the same object

    student2.name = "Bob"; // Modifying student2 also changes student1 due to shared reference

    System.out.println(student1.name); // Output: Bob
  }
}
