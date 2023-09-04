public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali Hoca", "555", "Math");
        Teacher t2 = new Teacher("Ahmet Hoca", "532", "FZK");
        Teacher t3 = new Teacher("Mehmet Hoca", "545", "BIO");

        Course math = new Course("Matematik", "101", "Math");
        math.addTeacher(t1);
        Course verbalMath = new Course("Matematik","101","Math");
        verbalMath.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course verbalFzk = new Course("Fizik","102", "FZK");
        verbalFzk.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103", "BIO");
        biyo.addTeacher(t3);
        Course verbalBiyo=new Course("Biyoloji","103", "BIO");
        verbalBiyo.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal", "123", "4", math, fizik, biyo,verbalMath,verbalFzk,verbalBiyo);
        s1.addBulkExamNote(100,64,50,30,60,90);
        s1.isPass();
        Student s2 = new Student("Düdük Necmi","124","4",math,fizik,biyo,verbalMath,verbalFzk,verbalBiyo);
        s2.addBulkExamNote(50,30,70,20,80,100);
        s2.isPass();
    }
}