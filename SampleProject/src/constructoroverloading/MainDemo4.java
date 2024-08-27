package constructoroverloading;

import java.util.Date;

class ReportGeneration
{
	ReportGeneration(int id)
	{
		System.out.println("Project ID : " +id);
	}

	ReportGeneration(String title)
	{
		System.out.println("Project Title: " +title);
	}

	ReportGeneration(Date publisheddate)
	{
		System.out.println("Project PublishedDate:" +publisheddate);
	}

	ReportGeneration(byte pagecount)
	{
		System.out.println("Project PageCount: " +pagecount);
	}

	ReportGeneration(boolean ispublished)
	{
		System.out.println("Project isPublished:" +ispublished);
	}
}

public class MainDemo4 {

	public static void main(String[] args) {
		ReportGeneration o1=new ReportGeneration(12);
		ReportGeneration o2=new ReportGeneration("Article Journal Management System");
		ReportGeneration o3=new ReportGeneration("2023-03-28");
		ReportGeneration o4=new ReportGeneration(95);
		ReportGeneration o5=new ReportGeneration("true");
	}
}
