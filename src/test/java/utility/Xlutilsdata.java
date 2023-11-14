package utility;

import java.util.Map;

public class Xlutilsdata {
	
	//Program
	public static String programName;
	public static String programdrscrption;
	public static String programstatus;
	
	//Class
	public static String batchID_class;
	public static String noofclasses;
	public static String classdate;
	public static String classtopic;
	public static String StaffId;
	public static String classdescrption;
	public static String comments;
	public static String Notes;
	public static String Recording;
	
	static Map<String,String>excelDataMap;
	
	//Program
	public static Map<String,String>ProgramXLdata(String datakey,String Sheetname){
		
		excelDataMap =Xlutils.getData(datakey,Sheetname);
		
		batchID_class=excelDataMap.get("batchID_class");
		programdrscrption=excelDataMap.get("Programdescrption");
		programstatus=excelDataMap.get("programstatus");
		
	}
	//Class
		public static Map<String,String>ClassXLdata(String datakey,String Sheetname){
			
			excelDataMap =Xlutils.getData(datakey,Sheetname);
			
			programName=excelDataMap.get("batchName");
			noofclasses=excelDataMap.get("noofclasses");
			classdate=excelDataMap.get("classdate");
			classtopic=excelDataMap.get("classtopic");
			StaffId=excelDataMap.get("StaffId");
			classdescrption=excelDataMap.get("classdescrption");
			comments=excelDataMap.get("comments");
			Notes=excelDataMap.get("Notes");
			Recording=excelDataMap.get("Recording");
			
			
			
		}
	

}
