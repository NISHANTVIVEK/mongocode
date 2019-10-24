package com.cg.training.mongodemo.bean;



//import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Employee")

public class Employeeentity {
	@Id
	 private String _id;
	 private int empid;
	 private String empname;
	
	public  String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employeeentity [_id=" + _id + ", empid=" + empid + ", empname=" + empname + "]";
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	

}
