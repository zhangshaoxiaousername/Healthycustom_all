package com.group.healthycustom.client.dao.mapping;

import com.group.healthycustom.client.pojo.Admin;

import java.util.List;

/**
 * @author: yuan feih
 * @data: 2019/7/25 23:43
 * @description:
 */
public interface AdminMapperXml {
    /**
     * 客服管理
     * 客服全部展示
     */
    List<Admin> selectAllAdmin();

    /**
     * 客服管理
     * 客服单个展示
     */
    Admin selectAdminById(Integer aId);

    /**
     * 客服管理
     * 客服添加
     */
    Integer addAdmin(Admin admin);

    /**
     * 客服管理
     * 客服更新
     */
    Integer updateAdmin(Admin admin);

    /**
     * 客服管理
     * 客服删除
     */
    Integer deleteAdmin(Integer aId);
}
