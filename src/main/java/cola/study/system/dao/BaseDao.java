package cola.study.system.dao;

import cola.study.system.pojo.BaseEntity;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Cola_Ubuntu
 * @name BaseDao
 * @DATE 2023/5/8 上午8:28
 * @description BaseDao
 */
@NoRepositoryBean
public interface BaseDao<T extends BaseEntity> extends JpaRepository<T,Integer> {


    @Override
    @Query("SELECT t FROM #{#entityName}  t WHERE t.id = ?1 AND t.isDeleted = 0 ")
    @Transactional(readOnly = true)
    Optional<T> findById(Integer integer);

    @Override
    @Query("SELECT t FROM #{#entityName}  t WHERE t.isDeleted = 0 ")
    @Transactional(readOnly = true)
    List<T> findAll();

    @Query("UPDATE #{#entityName} t SET t.isDeleted = 1 WHERE t.id = ?1")
    @Modifying
    @Transactional(rollbackFor = Exception.class)
    void logicDeleteById(Integer id);
}
