package com.kiranacademy;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
public class InfratructureService {

	@Autowired 
	InfrastructureDao infrastructureDao;
	
	public ArrayList<Bridge> fetchBridgesInfo() throws Exception {
		ArrayList<Bridge> alBridgesList = infrastructureDao.fetchBridgesInfo();
		return alBridgesList;
	}
}
