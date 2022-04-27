package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Text2;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-04-27
 */
public interface Text2Mapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Text2 selectText2ById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param text2 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Text2> selectText2List(Text2 text2);

    /**
     * 新增【请填写功能名称】
     * 
     * @param text2 【请填写功能名称】
     * @return 结果
     */
    public int insertText2(Text2 text2);

    /**
     * 修改【请填写功能名称】
     * 
     * @param text2 【请填写功能名称】
     * @return 结果
     */
    public int updateText2(Text2 text2);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteText2ById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteText2ByIds(Long[] ids);
}
