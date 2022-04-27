package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.Text2Mapper;
import com.ruoyi.system.domain.Text2;
import com.ruoyi.system.service.IText2Service;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-27
 */
@Service
public class Text2ServiceImpl implements IText2Service 
{
    @Autowired
    private Text2Mapper text2Mapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Text2 selectText2ById(Long id)
    {
        return text2Mapper.selectText2ById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param text2 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Text2> selectText2List(Text2 text2)
    {
        return text2Mapper.selectText2List(text2);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param text2 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertText2(Text2 text2)
    {
        return text2Mapper.insertText2(text2);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param text2 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateText2(Text2 text2)
    {
        return text2Mapper.updateText2(text2);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteText2ByIds(Long[] ids)
    {
        return text2Mapper.deleteText2ByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteText2ById(Long id)
    {
        return text2Mapper.deleteText2ById(id);
    }
}
