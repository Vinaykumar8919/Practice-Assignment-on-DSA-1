import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class Checker implements Comparator<Student> {
    public int compare(Student p1, Student p2) {
        if (p1.getCgpa() > p2.getCgpa())
            return -1;
        else if (p1.getCgpa() < p2.getCgpa())
            return 1;
        else {
            if (!p1.getFname().equals(p2.getFname()))
                return p1.getFname().compareTo(p2.getFname());
            else {
                return Integer.compare(p1.getId(), p2.getId());
            }
        }
    }
}

public class Solution_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        // Sort the studentList using the Checker comparator
        Collections.sort(studentList, new Checker());

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}
