package cvut.fel.rsp.eduaplan.service;

import cvut.fel.rsp.eduaplan.dao.BaseDaoTestEntity;
import cvut.fel.rsp.eduaplan.model.BaseTestEntity;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;
import java.util.List;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author Stepan Skalka
 */
public class TeacherServiceTest {

    @InjectMocks
    BaseServiceTestEntity sut;

    @Mock
    BaseDaoTestEntity dao;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

//    @Test
//    public void findAllByAds(){
//        System.out.println("findAllByAds");
//
//        List<BaseTestEntity> entities = Ge;
//
//        when(dao.findAll()).thenReturn(entities);
//
//        List result = sut.findAll();
//
//        assertNotNull(result);
//        assertEquals(entities.size(), result.size());
//        assertEquals(entities, result);
//    }
}
