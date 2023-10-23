package Projects.OgrenciInfoSystem;

public class Course {
    Teacher teacher;
   String name;
   String code;
   String prefix;
   int note;

   Course (String name, String code, String prefix){
       this.name=name;
       this.code=code;
       this.prefix=prefix;
       this.note=0;
   }

   void addTeacher(Teacher teacher){
       this.teacher=teacher;
       printTeacherInfo();
   }

   void printTeacherInfo(){
       this.teacher.Print();
   }
}
