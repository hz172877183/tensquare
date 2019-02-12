package com.tensquare.base.service;

import com.tensquare.base.dao.LabelDao;
import com.tensquare.base.pojo.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import until.IdWorker;

import java.util.List;

/**
 * @Description: 标签服务层
 * @ProjectName: tensquare_parent
 * @Package: com.tensquare.base.service
 * @Author: hz
 * @Date: 2019/2/12 17:37
 * @Version: 1.0
 */
@Service
public class LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 查询全部标签
     *
     * @return
     */
    public List<Label> findAll() {
        return labelDao.findAll();
    }

    /**
     * 根据ID查询标签
     *
     * @return
     */
    public Label findById(String labelId) {
        return labelDao.findById(labelId).get();
    }

    /**
     * 增加标签
     * @param label
     */
    public void add(Label label){
        label.setId(idWorker.nextId()+"");
        labelDao.save(label);
    }

    /**
     * 修改标签
     * @param label
     */
    public void update(Label label){
        labelDao.save(label);
    }

    /**
     * 删除标签
     * @param id
     */
    public void deleteById(String id){
        labelDao.deleteById(id);
    }

}
