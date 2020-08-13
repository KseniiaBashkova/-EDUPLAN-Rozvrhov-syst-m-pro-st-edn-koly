package cvut.fel.rsp.eduaplan.dao;

import cvut.fel.rsp.eduaplan.model.BaseTestEntity;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDaoTestEntity extends BaseDao<BaseTestEntity> {

    protected BaseDaoTestEntity() {
        super(BaseTestEntity.class);
    }
}
