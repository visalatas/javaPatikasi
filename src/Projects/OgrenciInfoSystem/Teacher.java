package Projects.OgrenciInfoSystem;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name=name;
        this.mpno=mpno;
        this.branch=branch;
    }
    void Print(){
        System.out.println("adı:" +this.name);
        System.out.println("no:" +this.mpno);
        System.out.println("Bölümü:" +this.branch);

    }
}
