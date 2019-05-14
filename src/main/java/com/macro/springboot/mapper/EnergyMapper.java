package com.macro.springboot.mapper;

import com.macro.springboot.entity.Building;
import com.macro.springboot.entity.Energy;
import org.apache.ibatis.annotations.Select;

public interface EnergyMapper {

	//根据建筑id,时间查询建筑天能耗数据
	@Select("select * from [Energy] where building_code = #{buildingCode}")
	Energy findEnergyByBuildingCode(String buildingCode);

	//根据建筑id查询建筑信息
	@Select("select * from [Building] where building_code = #{buildingCode}")
	Building findBuildingInfoByBuildingCode(String buildingCode);

}
