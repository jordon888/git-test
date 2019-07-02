package com.huangjuan.demo.dao;

import com.huangjuan.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /*
    列出区域列表
     */
    List<Area> queryArea();
    /*
    根据id列出具体区域
     */
    Area queryAreaById(int areaId);
    /*
    添加
     */
    int insertArea(Area area);

    int updateArea(Area area);

    int deleteArea(Area area);
}
