import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listText2(query) {
  return request({
    url: '/system/text2/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getText2(id) {
  return request({
    url: '/system/text2/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addText2(data) {
  return request({
    url: '/system/text2',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateText2(data) {
  return request({
    url: '/system/text2',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delText2(id) {
  return request({
    url: '/system/text2/' + id,
    method: 'delete'
  })
}
