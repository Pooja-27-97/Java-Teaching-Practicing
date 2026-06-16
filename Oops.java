public class Oops {
    public static void main(String[] args) {
        // Car c1 = new Car();
        // c1.color = "Dark Blue";
        // c1.brand = "BMW";
        // c1.year = 1998;
        // System.out.println(c1.brand);
        // System.out.println(c1.color);

        // Car c2 = new Car();
        // c2.brand = "Porsche";
        // c2.color = "Black";
        // System.out.println(c2.brand);
        // System.out.println(c2.color);

        // Car c3 = new Car();
        // c3.setColor("Peach");
        // System.out.println(c3.getColor());

        Student s1 = new Student();
        s1.name = "Sukuna";
        s1.marks[0] = 100;
        s1.marks[1] = 87;
        s1.marks[2] = 98;
        // System.out.println(s1.getName());
        // System.out.println(s1.marks[0] + " " + s1.marks[1] + " " + s1.marks[2]);

        Student s2 = new Student(s1);
        for(int i=0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
        // System.out.println(s2.getName());

        // Student s3 = new Student("Yuri", 120);
        // System.out.println(s3.getName());
        // System.out.println(s3.getRoll());
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    Student() {
        System.out.println("Student class");
    }

    Student(String name) {
        this.name = name;
    }
    
    Student(String name, int roll) {
        this.name = name;
        this.roll =  roll;
    }

    //shallow
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

//     //Deep-copy
//     Student(Student s1) {
//         marks = new int[3];
//         this.name = s1.name;
//         this.roll = s1.roll;
//         for(int i=0; i < marks.length ; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }

    String getName() {
        return this.name;
    }

    int getRoll() {
        return this.roll;
    }
}

// class Car {
//     String color;
//     String brand;
//     int year;

//     Car() {
//         System.out.println("Car class");
//     }

//     void setColor(String newColor) {
//         color = newColor;
//     }
//     String getColor() {
//         return this.color;
//     }
// }