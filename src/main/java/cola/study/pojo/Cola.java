package cola.study.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Cola_Ubuntu
 * @name Cola
 * @DATE 2023/5/8 上午7:31
 * @description Cola
 */
@Data
@Entity(name = "sys_cola")
public class Cola {

    @Id
    private Long id;

}
