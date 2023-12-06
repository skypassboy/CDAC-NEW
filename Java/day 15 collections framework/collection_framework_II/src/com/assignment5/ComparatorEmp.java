package com.assignment5;

import java.util.Comparator;

public class ComparatorEmp implements Comparator<Emp>{

//	@Override
//	public int compare(Emp e1, Emp e2) {
//		
//		if(e1.getSalary()>e2.getSalary()) {
//			return 1;
//		}
//		else if(e1.getSalary()<e2.getSalary()) {
//			return -1;
//		}
//		else {
//			
//			if(e1.getName().length()<e2.getName().length()) {
//				return 1;
//			}
//			else if(e1.getName().length()>e2.getName().length()) {
//				return -1;
//			}
//			else {
//				if(e1.getEmpid()>e2.getEmpid()) {
//					return 1;
//				}
//				else if(e1.getEmpid()>e2.getEmpid()) {
//					return -1;
//				}
//				else {
//					return 0;
//				}
//			}
//			
//			
//		}
//		
//	}

	
	
	@Override
	public int compare(Emp e1, Emp e2) {
		
		if(e1.getSalary()>e2.getSalary()) {
			return -1;
		}
		else if(e1.getSalary()<e2.getSalary()) {
			return 1;
		}
		else {
			if(e1.getName().length()<e2.getName().length()) {
				return -1;
			}
			else if(e1.getName().length()>e2.getName().length()) {
				return 1;
			}
			else {
				if(e1.getEmpid()>e2.getEmpid()) {
					return 1;
				}
				else if(e1.getEmpid()>e2.getEmpid()) {
					return -1;
				}
				else {
					return 0;
				}
			}
		}
		
	}

	
	
	
	
}
