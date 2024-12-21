public class Student {
    public static int cseCount;
    public static int otherCount;
    public static int totalStudent;
    public int studentID;
    public String dept;
    public String studentName;
    public double cgpa;

    public Student(String s, double d){
        studentName = s;
        cgpa = d;
        dept = "CSE";
        cseCount++;
        totalStudent++;
        studentID = totalStudent;
    }

    public Student(String s1, double d, String s2){
        studentName = s1;
        cgpa = d;
        dept = s2;
        otherCount++;
        totalStudent++;
        studentID = totalStudent;
    }

    public void individualDetail(){
        System.out.println("ID: " + studentID + "\nName: " + studentName + "\nCGPA: " + cgpa + "\nDepartment: " + dept);
    }

    public static void printDetails(){
        System.out.println("Total Student(s): " + totalStudent + "\nCSE Student(s): " + cseCount + "\nOther Department Student(s): " + otherCount);
    }
}
