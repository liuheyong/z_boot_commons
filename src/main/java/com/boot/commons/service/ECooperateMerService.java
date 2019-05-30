package com.boot.commons.service;

import com.boot.commons.dto.ECooperateMer;

import java.util.List;

/**
 * @author: LiuHeYong
 * @create: 2019-05-22
 * @description: ECooperateMerService
 **/
public interface ECooperateMerService {

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.commons.dto.ECooperateMer
     * @exception:
     * @description: 详情
     */
    ECooperateMer queryECooperateMerInfo(ECooperateMer eCooperateMer) throws Exception;

    /**
     * @date: 2019/5/24
     * @param: [eCooperateMer]
     * @return: com.boot.commons.dto.ECooperateMer
     * @exception:
     * @description: 列表
     */
    List<ECooperateMer> queryECooperateMerListPage(ECooperateMer eCooperateMer) throws Exception;
}
