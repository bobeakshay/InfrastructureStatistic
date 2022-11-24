package com.kiranacademy;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfratructureController {
	
	@Autowired
	X xx = null;
	
	@Autowired
	InfratructureService infratructureService = null;
	
	@GetMapping("checkobjectcreation")
	private void learnIOC() {	
		xx.m2();

	}
	@RequestMapping("bridgescount")
	int noOfBridgesInIndia() {
		return 7885;
	}
	@PostMapping("addbridgeinfo")
	private void addBridge(Bridge bridge) {
		System.out.println("bridge info...");
	}
	@RequestMapping("bridgeinfo")
	Bridge fetchBridgeInfo() {
		Bridge bridge = new Bridge("pune", 1, "600 mtr", "100 mtr");
		return bridge;
	}
	@RequestMapping("bridgesinfo")
		ArrayList<Bridge> fetchBridgesInfo() throws Exception{
		ArrayList<Bridge> listBridges = infratructureService.fetchBridgesInfo();
		return listBridges;
	}
	@RequestMapping("bridgesnamebycity/{cityname}/{villagename}")
	ArrayList<String> nameOfBridgesinCity(@PathVariable String cityname, @PathVariable String villagename){
		System.out.println("I am in nameOfBridgesinCity >> " + cityname);
		ArrayList<String> listBridge = new ArrayList<String>();
		if (cityname.equals("pune")) {
			listBridge.add("rajaram bridge");
			listBridge.add("z bridge");
			listBridge.add("navale bridge");
			listBridge.add("warje bridge");
			listBridge.add("dandekar bridge");
		}
		else {
			listBridge.add("rajaram bridge");
			listBridge.add("z bridge");
			listBridge.add("navale bridge");
			listBridge.add("warje bridge");
			listBridge.add("dandekar bridge");
		}
		return listBridge;
	}
}
