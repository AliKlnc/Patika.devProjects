public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalMath;
    int verbalFzk;
    int verbalBiyo;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalFzk = 0;
        this.verbalBiyo = 0;
        this.verbalMath = 0;
    }

    void addTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
        if (courseTeacher.branch.equals(this.prefix)) {
            this.courseTeacher = courseTeacher;
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor.");
        }
    }

    void printTeacherInfo() {
        this.courseTeacher.print();
    }

}
