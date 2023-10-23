package Projects.OgrenciInfoSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stno;
    String classes;
    int average;
    boolean isPass;

    Student(String name, String stno, String classes, Course c1,Course c2,Course c3){
        this.name=name;
        this.stno=stno;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;
        }
        if(note2>0 && note2<100){
            this.c2.note=note2;
        }
        if(note3>0 && note3<100){
            this.c3.note=note3;
        }
    }
    Void printNote(){
        System.out.println(c1.name+"notu\t"+c1.note);
        System.out.println(c2.name+"notu\t"+c2.note);
        System.out.println(c3.name+"notu\t"+c3.note);
        return null;
    }


}
