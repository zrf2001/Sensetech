import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listText(query) {
  return request({
    url: '/system/text/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getText(id) {
  return request({
    url: '/system/text/' + id,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addText(data) {
  return request({
    url: '/system/text',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateText(data) {
  return request({
    url: '/system/text',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delText(id) {
  return request({
    url: '/system/text/' + id,
    method: 'delete'
  })
}
