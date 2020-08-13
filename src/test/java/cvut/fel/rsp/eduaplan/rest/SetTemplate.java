package cvut.fel.rsp.eduaplan.rest;


import cvut.fel.rsp.eduaplan.model.Student;
import cvut.fel.rsp.eduaplan.model.Subject;
import cvut.fel.rsp.eduaplan.model.User;

public class SetTemplate {

    public static Subject setCourse(Integer id, String code, String name, Integer id_teacher) {
        final Subject course = new Subject();
        course.setId(id);
        course.setCode(code);
        course.setName(name);
        course.setId_teacher(id_teacher);
        return course;
    }


    public static Student setStudent(Integer id, Integer id_group,
                                     String email, String firstName, String secondName, String password, String username) {
        final Student student = new Student();
        student.setId(id);
        student.setId_group(id_group);
        student.setEmail(email);
        student.setFirst_name(firstName);
        student.setSecond_name(secondName);
        student.setPassword(password);
        student.setLogin(username);
        return student;
    }
}
