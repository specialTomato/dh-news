package wz.dh.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import wz.dh.model.common.dtos.ResponseResult;
import wz.dh.model.user.dtos.LoginDto;
import wz.dh.model.user.pojos.ApUser;

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
