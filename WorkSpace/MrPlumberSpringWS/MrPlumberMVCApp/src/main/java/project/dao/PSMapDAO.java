package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.entities.PlumberServiceMapTbl;
import project.repository.PlumberServiceMapRepo;

@Service
public class PSMapDAO 
{
	@Autowired
	PlumberServiceMapRepo psmapRepo;

	public void addpsmap(PlumberServiceMapTbl psmapdata)
	{
		System.out.println("in PSMAP_Dao class");
		psmapRepo.save(psmapdata);
	}
}
	