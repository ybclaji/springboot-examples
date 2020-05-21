package org.yanse.springbootmybatis01.mapper;

import java.util.List;
import org.yanse.springbootmybatis01.model.City;

public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    City selectByPrimaryKey(Integer id);

    List<City> selectAll();

    int updateByPrimaryKey(City record);
}