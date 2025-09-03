package site.corki.gateway.service;

import cn.dev33.satoken.model.wrapperInfo.SaDisableWrapperInfo;
import cn.dev33.satoken.stp.StpInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StpInterfaceImpl implements StpInterface {
    @Override
    public SaDisableWrapperInfo isDisabled(Object loginId, String service) {
        return StpInterface.super.isDisabled(loginId, service);
    }

    @Override
    public List<String> getPermissionList(Object o, String s) {
        // 返回此 loginId 拥有的权限列表
        return List.of();
    }

    @Override
    public List<String> getRoleList(Object o, String s) {

        return List.of();
    }
}
