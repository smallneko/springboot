package com.macro.springboot.controller;

import com.macro.springboot.entity.Building;
import com.macro.springboot.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/building/*")
public class BuildingController {

	@Autowired
	BuildingService buildingService;

	@RequestMapping("list")
	public List<Building> list(Building building) {
		return buildingService.list(building);
	}

	@RequestMapping("get")
	public Building get(Building building) {
		return buildingService.get(building);
	}

	@RequestMapping("update")
	public int update(Building building) {
		return buildingService.update(building);
	}

	@RequestMapping("save")
	public int save(Building building) {
		return buildingService.save(building);
	}

	@RequestMapping("delete")
	public int delete(Building building) {
		return buildingService.delete(building);
	}
}
