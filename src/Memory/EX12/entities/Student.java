package Memory.EX12.entities;

public class Student {
    private String name;
    private double firtNote;
    private  double secondNote;

    public Student(String name, double firstNote, double secondNote) {
        this.name = name;
        this.firtNote = firstNote;
        this.secondNote = secondNote;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstNote() {
        return firtNote;
    }

    public void setFirstNote(double firtNote) {
        this.firtNote = firtNote;
    }

    public double getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(double secondNote) {
        this.secondNote = secondNote;
    }

    public double average() {
        return (firtNote + secondNote) / 2.0;
    }

    public static String averageClass(Student[] students) {
        double sum = 0.0;

        for (Student s : students) {
            sum += s.average();
        }

        double media = sum  / students.length;
        return String.format("Class average: %.2f", media);
    }


}
