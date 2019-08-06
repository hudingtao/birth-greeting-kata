package com.example.utils;

import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:05
 */
public class FileUtilTest {

    @Test
    public void testLoadDataIsEmpty() {
        assert FileUtil.loadData().size() == 0 : "为空时加载数据错误";
    }

    @Test
    public void testLoadDataIsNormal() {
        assert FileUtil.loadData().size() > 0 : "不为空时获取数据异常";
    }
}
