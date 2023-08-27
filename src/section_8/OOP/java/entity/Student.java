package section_8.OOP.java.entity;

public class Student {
    private String name;
    private double note_1;
    private double note_2;
    private double note_3;

    public Student(String name,double note_1,double note_2,double note_3){
        this.name = name;
        this.note_1 = note_1;
        this.note_2 = note_2;
        this.note_3 = note_3;
    }

    private double finalGrade(){
        return (note_1+note_2+note_3);
    }
   public String toString(){
        System.out.println();
        return finalGrade()>=60?"FINAL GRADE: "+finalGrade()+"\nPASS":"FINAL GRADE: "+finalGrade()+"\nFAILED\n"+"MISSING"+(60-finalGrade())+"POINTS";
   }


}
