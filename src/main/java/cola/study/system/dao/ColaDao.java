package cola.study.system.dao;

import cola.study.system.pojo.Cola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Cola_Ubuntu
 * @name ColaDao
 * @DATE 2023/5/8 上午8:11
 * @description ColaDao
 */
@Repository
public interface ColaDao extends BaseDao<Cola> {
}
