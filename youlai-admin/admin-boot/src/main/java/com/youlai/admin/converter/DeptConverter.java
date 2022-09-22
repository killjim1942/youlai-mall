package com.youlai.admin.converter;

import com.youlai.admin.pojo.entity.SysDept;
import com.youlai.admin.pojo.form.DeptForm;
import com.youlai.admin.pojo.vo.dept.DeptDetailVO;
import org.mapstruct.Mapper;

/**
 * 部门对象转换器
 *
 * @author haoxr
 * @date 2022/7/29
 */
@Mapper(componentModel = "spring")
public interface DeptConverter {

    DeptDetailVO entity2DetailVO(SysDept entity);

    SysDept form2Entity(DeptForm deptForm);

}