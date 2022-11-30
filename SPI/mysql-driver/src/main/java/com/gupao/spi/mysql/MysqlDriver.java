package com.gupao.spi.mysql;

import com.gupao.spi.DataBaseDirver;

/**
 * @author 帅气的景天老师
 * @create 2021/8/5 15:53
 */
public class MysqlDriver implements DataBaseDirver {
    @Override
    public String buildConnect(String s) {
        return "Mysql的驱动实现："+s;
    }
}
