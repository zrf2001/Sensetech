package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Text;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-27
 */
public interface TextMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Text selectTextById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param text 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Text> selectTextList(Text text);

    /**
     * 新增【请填写功能名称】
     * 
     * @param text 【请填写功能名称】
     * @return 结果
     */
    public int insertText(Text text);

    /**
     * 修改【请填写功能名称】
     * 
     * @param text 【请填写功能名称】
     * @return 结果
     */
    public int updateText(Text text);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTextById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTextByIds(Long[] ids);
}
