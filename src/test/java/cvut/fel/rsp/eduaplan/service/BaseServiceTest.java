package cvut.fel.rsp.eduaplan.service;

import cvut.fel.rsp.eduaplan.dao.BaseDaoTestEntity;
import cvut.fel.rsp.eduaplan.Enviroment.Generator;
import cvut.fel.rsp.eduaplan.model.BaseTestEntity;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertNotNull;

/**
 *
 * @author Patrik Jankuv
 */
public class BaseServiceTest {

    @InjectMocks
    BaseServiceTestEntity sut;

    @Mock
    BaseDaoTestEntity dao;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testFindAll(){
        List<BaseTestEntity> entities = generateListOfBaseEntities(99);

        when(dao.findAll()).thenReturn(entities);

        List result = sut.findAll();

        assertNotNull(result);
        assertEquals(entities.size(), result.size());
        assertEquals(entities, result);
    }

    @Test
    public void testFind(){
        BaseTestEntity be = Generator.generateBasicEntity();

        when(dao.find(be.getId())).thenReturn(be);

        BaseTestEntity result = sut.find(be.getId());

        assertNotNull(result);
        assertEquals(be.getValue(), result.getValue());
        assertEquals(be, result);
    }

    @Test
    public void testPersist(){
        BaseTestEntity be = Generator.generateBasicEntity();

        sut.persist(be);

        verify(dao, times(1)).persist(be);
    }

    @Test
    public void testUpdate(){
        BaseTestEntity be = Generator.generateBasicEntity();

        sut.update(be);

        verify(dao, times(1)).update(be);
    }


    @Test
    public void testRemove(){
        BaseTestEntity be = Generator.generateBasicEntity();

        sut.remove(be);

        verify(dao, times(1)).remove(be);
    }
    private List<BaseTestEntity> generateListOfBaseEntities(int n){
        List<BaseTestEntity> entities = new ArrayList<>();

        for(int i = 0; i < 99; i++){
            BaseTestEntity be = Generator. generateBasicEntity();
            entities.add(be);
        }

        return entities;
    }
}
