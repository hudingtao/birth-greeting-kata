package com.example.manage;

import com.example.data.DataSoure;
import com.example.data.FileDataSource;
import com.example.email.EmailTool;
import com.example.judge.SpecialBirthdayJudge;
import com.example.service.BirthService;
import com.example.judge.CommonBirthdayJudge;
import com.example.judge.Judge;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiaotao
 * @version 1.0
 */
public class EntityManage {
    private final Map<String, Object> entityMap = new ConcurrentHashMap<>();
    private final DataSoure fileDataSource = new FileDataSource();
    private final EmailTool emailTool = new EmailTool();
    private final Judge commonBirthdayJudge = new CommonBirthdayJudge();
    private final Judge specialBirthdayJudge = new SpecialBirthdayJudge();
    private final BirthService birthService = new BirthService(
            fileDataSource, commonBirthdayJudge, specialBirthdayJudge, emailTool);

    public EntityManage() {
        entityMap.put(getClassName(fileDataSource), fileDataSource);
        entityMap.put(getClassName(emailTool), emailTool);
        entityMap.put(getClassName(commonBirthdayJudge), commonBirthdayJudge);
        entityMap.put(getClassName(specialBirthdayJudge), specialBirthdayJudge);
        entityMap.put(getClassName(birthService), birthService);
    }

    public Object getEntity(String name) {
        return entityMap.get(name);
    }

    private String getClassName(Object o) {
        return o.getClass().getSimpleName();
    }
}
