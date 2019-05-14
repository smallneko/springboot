package com.macro.springboot.service.impl;

import com.macro.springboot.entity.Building;
import com.macro.springboot.entity.Energy;
import com.macro.springboot.mapper.EnergyMapper;
import com.macro.springboot.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnergyServiceImpl implements EnergyService {

	@SuppressWarnings("all")
	@Autowired
	EnergyMapper energyMapper;

	@Override
	public Energy findEnergyByBuildingCode(String buildingCode){
		return energyMapper.findEnergyByBuildingCode(buildingCode);
	}

	@Override
	public Building findBuildingInfoByBuildingCode(String buildingCode){
		return energyMapper.findBuildingInfoByBuildingCode(buildingCode);
	}


}
