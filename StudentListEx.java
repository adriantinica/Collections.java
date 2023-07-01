/***
 * https://github.com/dorinesinenco/EDUQATION/blob/master/programming/java/collections/students-al/README.ro.md
 */
import java.util.ArrayList;
import java.util.List;

public class StudentListEx {

    public static void main(String[] args) {

        //Adaugati 5 studenti in lista cu nume, specialitate si note diferite.
        

        
        Student student1 = new Student("James Gosling", "Computer science", 9.00f);
        Student student2 = new Student("Tinica Adrian", "Programming", 7.1f);
        Student student3 = new Student("John Doe", "Physics", 10.00f );
        Student student4 = new Student ("Ray Kroc", "Marketing", 5.6f);
        Student student5 = new Student ("Beth Mead", "football player", 9.0f);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        

    
        //Gasiti index celui mai bun student din lista si pastrati-l in variabila indexOfTheBest
        
        int indexOfTheBest = 0;
        float maxGrade = students.get(0).getGrade();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getGrade() > maxGrade) {
                maxGrade = students.get(i).getGrade();
                indexOfTheBest = i;
            }
        System.out.println(indexOfTheBest);

        //Mariti nota acestuia cu 0.1 accesandu-l prin lista + index
        
        students.get(indexOfTheBest).grade += 0.1f;
       
       
        //Toti studentii care invata pe 8.0+ sa fie adaugati intr-o lista noua cu numele bestStudents
        for (int j = 1; j < students.size(); j++) {
            if (students.get(j).getGrade() > 8.0) {
                List<Student> bestStudents = new ArrayList<>();
                bestStudents.add(students.get(j));
            }
        }
        
        for (int k = 0; k < bestStudents.size(); k++) {
            System.out.println(bestStudents.get(k));
        }
        
        
        System.out.println(students.get(1).getGrade()); // verificare




        //raspundeti la intrebarea ********* - de ce cand declaram toString() in clasa, se zice ca de fapt noi il suprascriem ("override")?

        //metoda .toString() este by default creata in super/ root classa Object a limbajului Java, noi o suprascriem pentru a denumi in particular obiectul nou creat.
        // Altfel decat denumirea data automat de Java.










    }
}

 class Student{


        String fullname;
        String specialty;
        Float  grade;

        public Student(String fullname, String specialty, Float grade) {
            this.fullname = fullname;
            this.specialty = specialty;
            this.grade = grade;
        }

        public String getFullname() {
            return fullname;
        }

        public void setFullname(String fullname) {
            this.fullname = fullname;
        }

        public String getSpecialty() {
            return specialty;
        }

        public void setSpecialty(String specialty) {
            this.specialty = specialty;
        }

        public Float getGrade() {
            return grade;
        }

        public void setGrade(Float grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student [fullname=" + fullname + ", specialty=" + specialty + ", grade=" + grade + "]";
        }


    }
