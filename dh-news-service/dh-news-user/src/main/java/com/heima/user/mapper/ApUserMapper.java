package wz.dh.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import wz.dh.model.user.pojos.ApUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ApUserMapper extends BaseMapper<ApUser> {
}
