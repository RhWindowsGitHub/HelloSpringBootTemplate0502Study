package cola.study.system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @name BaseEntity
 * @author Cola_Ubuntu
 * @DATE 2023/5/8 上午7:53
 * @description BaseEntity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_by")
    private Integer createdBy;
    @Column(name = "updated_by")
    private Integer updatedBy;
    @Column(name = "is_deleted",insertable = false,updatable = false)
    private Integer isDeleted;

}
