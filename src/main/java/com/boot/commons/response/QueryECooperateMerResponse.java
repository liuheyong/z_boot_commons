package com.boot.commons.response;

import com.boot.commons.dto.ECooperateMer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: LiuHeYong
 * @create: 2019-05-22
 * @description:
 **/
public class QueryECooperateMerResponse {

    private List<ECooperateMer> eCooperateMerList;

    public List<ECooperateMer> geteCooperateMerList() {
        if (eCooperateMerList == null) {
            return new ArrayList<>();
        }
        return eCooperateMerList;
    }

    public void seteCooperateMerList(List<ECooperateMer> eCooperateMerList) {
        this.eCooperateMerList = eCooperateMerList;
    }

}
