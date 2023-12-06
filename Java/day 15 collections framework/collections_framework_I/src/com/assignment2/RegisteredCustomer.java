package com.assignment2;

public class RegisteredCustomer extends Customer {

	
		private int regNo;
		
		public RegisteredCustomer() {
			super();
		}
		
		public RegisteredCustomer(String name,String emailId,double contactNo,int regNo) {
			super(name,emailId,contactNo);
			this.regNo = regNo;
		}

		public int getRegNo() {
			return regNo;
		}

		public void setRegNo(int regNo) {
			this.regNo = regNo;
		}

		@Override
		public String toString() {
			return "RegisteredCustomer [regNo=" + regNo +" "+ super.toString() +"]";
		}
		
		
		
		
}
