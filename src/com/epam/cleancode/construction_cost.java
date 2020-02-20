package com.epam.cleancode;

public class construction_cost {
	double total_area;
	  int standard;
	  boolean fully_automated_home;
	  construction_cost(double total_area,int standard,boolean fully_automated_home)
	  {
		  this.total_area=total_area;
		  this.standard=standard;
		  this.fully_automated_home=fully_automated_home;
	  }
	  double estimate()
	  {
		  double result=0;
		  if(standard==1) result=1200*total_area;
		  else if(standard==2) result=1500*total_area;
		  else if(standard==3)
		  {
			  if(fully_automated_home) result=2500*total_area;
			  else result=1800*total_area;
		  }
		  return result;
	  }

}
