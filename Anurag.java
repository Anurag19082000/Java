//oops concepts

public class Anurag{
    String name;
    int age;

    // Constructor
    public Anurag(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create an object of the class
        Anurag person = new Anurag("Anurag", 25);
        
        // Display the object's details
        person.displayInfo();
    }
}




/*
 *M (Modified): The file has been changed locally but not yet staged for commit.

A (Added): The file has been added to the staging area (using git add) and will be included in the next commit.

U (Unmerged/Unmodified in some contexts):

Often appears during a merge conflict: U means the file has unresolved conflicts.

In normal git status, U can also indicate untracked/unmerged, depending on the tool you use.
 */