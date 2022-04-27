package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TextMapper;
import com.ruoyi.system.domain.Text;
import com.ruoyi.system.service.ITextService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-04-27
 */
@Service
public class TextServiceImpl implements ITextService 
{
    @Autowired
    private TextMapper textMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Text selectTextById(Long id)
    {
        return textMapper.selectTextById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param text 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Text> selectTextList(Text text)
    {
        return textMapper.selectTextList(text);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param text 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertText(Text text)
    {
        return textMapper.insertText(text);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param text 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateText(Text text)
    {
        return textMapper.updateText(text);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTextByIds(Long[] ids)
    {
        return textMapper.deleteTextByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTextById(Long id)
    {
        return textMapper.deleteTextById(id);
    }
}
