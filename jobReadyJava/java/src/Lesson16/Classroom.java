package Lesson16;

import java.util.List;

public class Classroom {
    private String ClassName;
    private int classGradeLevel;
    private Teacher teacher; // Has-A Teacher
    private List<Student> student; // Has-A Student
    private int maxNumberStudents;

    public Classroom(String className, int ClassGradeLevel, Teacher teacher, List<Student> students,
            int maxNumberStudents) {
            this.classGradeLevel = classGradeLevel;
            this.ClassName = className;
            this.teacher = teacher;
            this.student = students;
            this.maxNumberStudents =   maxNumberStudents;
    }

}
