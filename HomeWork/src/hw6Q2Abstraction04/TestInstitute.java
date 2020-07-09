package hw6Q2Abstraction04;

public class TestInstitute {
	public static void main(String[] args) {
		
		ColumbiaUniversity newColObj = new ColumbiaUniversity();
		
		newColObj.chemistry();
		
		RockefellerUniversity newRockObj = new RockefellerUniversity();
		newRockObj.maths();
		University newUniObj = new University() {
			
			
			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void morgue() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void languageClub() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void laboratory() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void dorm() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void commonRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void teacher() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void gymnasium() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void field() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void classSize() {
				// TODO Auto-generated method stub
				
			}
		};
		newUniObj.classSize();
		newUniObj.field();
		newUniObj.teacher();
		newUniObj.gymnasium();
		University.library();
		
		
		Hospital newHosObj = new Hospital() {
			
			@Override
			public void surgeryRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void morgue() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void emergencyRoom() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void cafeteria() {
				// TODO Auto-generated method stub
				
			}
		};
		
		newHosObj.cafeteria();
		newHosObj.emergencyRoom();
		newHosObj.surgeryRoom();
		newHosObj.morgue();
		Hospital.pharmacy();
		MedicalSchool newMediObj = new MedicalSchool() {
			
			@Override
			public void computerLab() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void hygiene() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void biochemistryLab() {
				// TODO Auto-generated method stub
				
			}
		};
		
		newMediObj.anatomyLab();
		newMediObj.biochemistryLab();
		NursingSchool newNurObj = new NursingSchool() {
			
			@Override
			public void computerLab() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void hygiene() {
				
			}
	
	
	};
	newNurObj.caring();
	newNurObj.hygiene();
	
	}
}

