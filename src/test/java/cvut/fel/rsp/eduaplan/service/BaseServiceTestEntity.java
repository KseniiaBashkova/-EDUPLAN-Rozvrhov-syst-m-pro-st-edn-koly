package cvut.fel.rsp.eduaplan.service;

import cvut.fel.rsp.eduaplan.dao.BaseDaoTestEntity;
import cvut.fel.rsp.eduaplan.model.BaseTestEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Patrik Jankuv
 */
@Service
public class BaseServiceTestEntity extends BaseService<BaseTestEntity, BaseDaoTestEntity> {

    public BaseServiceTestEntity(BaseDaoTestEntity dao) {
        super(dao);
    }
}