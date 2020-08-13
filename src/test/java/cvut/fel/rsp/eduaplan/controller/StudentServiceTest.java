package cvut.fel.rsp.eduaplan.controller;

import cvut.fel.rsp.eduaplan.dao.StudentDao;
import cvut.fel.rsp.eduaplan.dao.UserDao;
import cvut.fel.rsp.eduaplan.model.Student;
import cvut.fel.rsp.eduaplan.rest.SetTemplate;
import cvut.fel.rsp.eduaplan.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class StudentServiceTest {

    private StudentDao studentDao = Mockito.mock(StudentDao.class);
    private UserDao schoolUserDao = Mockito.mock(UserDao.class);

    @Test
    public void performPersist_shouldReturnSuccessNotice() {
        StudentService studentService = new StudentService(studentDao);
        Student student = SetTemplate.setStudent(1,1, "email",
                "firstName", "secondName", "pass", "userName");
        studentService.persist(student);
    }
}