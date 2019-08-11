package com.example.email;

import com.example.data.DataSoure;
import com.example.manage.EntityManage;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xiaotao
 * @version 1.0
 * @date: Created in 2019/8/6 23:05
 */
public class FileDataSourceTest {

    private DataSoure fileDataSource;

    @Before
    public void dateSource() {
        this.fileDataSource = (DataSoure) new EntityManage().getEntity("FileDataSource");
    }

    @Test
    public void testLoadDataIsEmpty() {
        assert this.fileDataSource.loadData().size() == 0 : "为空时加载数据错误";
    }

    @Test
    public void testLoadDataIsNormal() {
        assert this.fileDataSource.loadData().size() > 0 : "不为空时获取数据异常";
    }
}
