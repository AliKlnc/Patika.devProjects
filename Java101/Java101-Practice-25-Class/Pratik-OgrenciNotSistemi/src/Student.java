public class Student {
    Course c1;
    Course c2;
    Course c3;

    Course verbalMath;
    Course verbalFzk;
    Course verbalBiyo;

    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3, Course verbalMath, Course verbalFzk, Course verbalBiyo) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPass = false;
        this.verbalMath = verbalMath;
        this.verbalFzk = verbalFzk;
        this.verbalBiyo = verbalBiyo;

    }

    void addBulkExamNote(int note1, int note2, int note3, int note11, int note21, int note31) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.verbalMath.note = note11;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.verbalFzk.note = note21;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.verbalBiyo.note = note31;
        }
    }

    void isPass() {

        this.average = (((this.c1.note + this.c2.note + this.c3.note) / 3.0) * 0.8) + (((this.verbalMath.note + this.verbalFzk.note + this.verbalBiyo.note) / 3.0) * 0.2);
        if (this.average > 55) {
            System.out.println("Sınıfı geçti.");
            this.isPass = true;
        } else {
            System.out.println("Sınıfta kaldı.");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu: " + (this.c1.note * 0.8 + this.verbalMath.note * 0.2));
        System.out.println(this.c2.name + " Notu: " + (this.c2.note * 0.8 + this.verbalFzk.note * 0.2));
        System.out.println(this.c3.name + " Notu: " + (this.c3.note * 0.8 + this.verbalBiyo.note * 0.2));
        System.out.println("Ortalama: " + this.average);
        System.out.println("=====================");
    }
}
