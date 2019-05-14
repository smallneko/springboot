package com.macro.springboot.controller;

import com.macro.springboot.pojo.R;
import com.macro.springboot.service.EnergyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/energy/*")
public class EnergyController {

	@Autowired
	EnergyService energyService;

	@RequestMapping(value = "findEnergyByBuildingCode/{buildingCode}", method = RequestMethod.GET)
	public R findEnergyByBuildingCode(@PathVariable("buildingCode") String buildingCode) {
		try {
			return R.isOk().data(energyService.findBuildingInfoByBuildingCode(buildingCode));
		} catch (Exception e) {
			return R.isFail(e);
		}
	}

	@RequestMapping(value = "findBuildingInfoByBuildingCode/{buildingCode}", method = RequestMethod.GET)
	public R findBuildingInfoByBuildingCode(@PathVariable("buildingCode") String buildingCode) {
		try {
			return R.isOk().data(energyService.findBuildingInfoByBuildingCode(buildingCode));
		} catch (Exception e) {
			return R.isFail(e);
		}
	}

}
