package cvut.fel.rsp.eduaplan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 *
 * @author Patrik Jankuv
 */
@SpringBootTest
@AutoConfigureMockMvc
public class BaseControllerTest {

//    @Autowired
//    private BaseControllerTestEntity controller;

    @Autowired
    private MockMvc mockMvc;

//    @Test
//    public void testGetEntities() throws Exception {
//        //todo
//        fail("Tests for controllers not done yer");
//    }
}
