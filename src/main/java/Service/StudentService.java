package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.studentDao;

@Service
public class StudentService { 
	
	@Autowired
	studentDao dao;
	
	//Service function will start from here

}
