package Projects.OgrenciInfoSystem;

public class Main {
    public static void main(String[] args) {

        Teacher t1 =new Teacher("Mahmut hoca", "5455789865","TRH");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        Course tarih= new Course("Tarih", "TRH","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        kimya.addTeacher(t3);

        Student s1=new Student("inek şaban", "123","4", tarih,fizik,kimya);
        s1.addBulkExamNote(100, 90,84);
        s1.printNote();
    }
}
