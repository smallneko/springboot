package com.macro.springboot.service;

import com.macro.springboot.entity.Building;
import com.macro.springboot.entity.Energy;

public interface EnergyService {

	Energy findEnergyByBuildingCode(String buildingCode);

	Building findBuildingInfoByBuildingCode(String buildingCode);
}
