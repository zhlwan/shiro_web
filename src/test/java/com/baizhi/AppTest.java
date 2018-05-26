package com.baizhi;

import com.baizhi.dao.AdminDao;
import com.baizhi.dao.Cmfz_ResourceDao;
import com.baizhi.dao.RoleDao;
import com.baizhi.entity.Admin;
import com.baizhi.entity.Cmfz_Resource;
import com.baizhi.entity.role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest {
    @Resource
    private AdminDao dao;

    @Resource
    private Cmfz_ResourceDao dao2;

    @Resource
    private RoleDao dao4;

    @Test
    public void shouldAnswerWithTrue() {
        Admin admin = dao.selectAllRole("赵洪磊");
        List<role> role = admin.getRole();
        for (com.baizhi.entity.role ss : role) {
            System.out.println(ss.getRole_name() + "=============================");
        }

    }

    @Test
    public void shouldAnswerWithTruexc() {
        role admin = dao4.selectAllRoleResource("user");
        List<Cmfz_Resource> resources = admin.getResources();
        for (Cmfz_Resource resource : resources) {
            System.out.println(resource.getResource_name());
        }
    }

}
