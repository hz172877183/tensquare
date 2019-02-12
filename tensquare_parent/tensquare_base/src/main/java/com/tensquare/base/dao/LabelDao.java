package com.tensquare.base.dao;

import com.tensquare.base.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description: 标签数据访问接口
 * @ProjectName: tensquare_parent
 * @Package: com.tensquare.base.dao
 * @Author: hz
 * @Date: 2019/2/12 17:34
 * @Version: 1.0
 */
public interface LabelDao extends JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {
    //JpaRepository提供了基本的增删改查
    //JpaSpecificationExecutor用于做复杂的条件查询
}
