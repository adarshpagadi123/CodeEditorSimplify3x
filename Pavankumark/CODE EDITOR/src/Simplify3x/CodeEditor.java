package Simplify3x;
import java.util.Random;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.simplifyqa.sqadrivers.androiddriver;
//import com.simplifyqa.sqadrivers.webdriver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import org.json.JSONArray;
//import com.simplifyqa.customMethod.SqaAutowired;
//import com.simplifyqa.method.GeneralMethod;
//import com.simplifyqa.sqadrivers.webdriver;
//import com.simplifyqa.customMethod.SqaAutowired;
//import com.simplifyqa.sqadrivers.webdriver;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.simplifyqa.Utility.HttpUtility;
//import com.simplifyqa.sqadrivers.webdriver;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import org.json.JSONArray;
//import org.json.JSONObject;
import java.awt.Robot;
//import com.fasterxml.jackson.databind.JsonNode;
//import com.simplifyqa.Utility.HttpUtility;
//import com.simplifyqa.Utility.UtilEnum;
//import com.simplifyqa.method.GeneralMethod;
//import com.simplifyqa.sqadrivers.webdriver;
//import com.simplifyqa.sqaobject.sqaobject;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
//import org.json.JSONArray;
//import com.simplifyqa.customMethod.SqaAutowired;
//import com.simplifyqa.sqadrivers.webdriver;

public class CodeEditor {
	//@SqaAutowired
	//public Object demo_object;

	private static final String[] EMAIL_DOMAINS = {"gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com"};
	private static final String[] PHONE_NUMBER_PREFIXES = { "666", "777", "888", "999"};
	public boolean csvvalidation(String csvFilePath, String data) {
		StringBuilder stringBuilder = readfile(csvFilePath);
		if (stringBuilder.length() != 0
				&& Arrays.asList(stringBuilder.toString().toLowerCase().split(",")).contains(data.toLowerCase())) {
			System.out.println("if");
			return true;
		} else {
			System.out.println("else");
			return false;
		}

	}

	public boolean csverrorvalidation(String uploadfilepath, String errorfilepath, String textmessage) {
		StringBuilder uploadfiledata = readfile(uploadfilepath);
		String errormessage = "";
		StringBuilder errorfiledata = readfile(errorfilepath);
		String[] list1 = uploadfiledata.toString().split(",");
		String[] list2 = errorfiledata.toString().split(",");

		if (uploadfiledata.length() != 0 && errorfiledata.length() != 0 && list2.length > list1.length) {
			for (int i = list1.length + 1; i < list2.length; i++) {
				if (i == list2.length - 1)
					errormessage += list2[i];
				else
					errormessage += list2[i] + ",";
			}
			String replacedString = errormessage.replaceAll("\"", "").trim();
			if (!replacedString.isEmpty() && replacedString.equals(textmessage.trim())) {
				System.out.println("if" + replacedString);
				return true;
			} else {
				System.out.println("else" + replacedString);
				System.out.println("else" + replacedString);
				return false;
			}

		} else {
			System.out.println("else");
			return false;
		}

	}

	/* public boolean generatelowercaserandomstring(String runtimeParam, String prefix, String strLenght,
	            String lowercaseruntime) {
	        try {
	            int[] array = {0, 3 };
	            GeneralMethod obj = new GeneralMethod();
	            String[] value_runtime = obj.runtimeparameter(array);
	            obj.generaterandomstring(runtimeParam, prefix, strLenght);
	            String generatelowercase= obj.getfromruntimecodeeditor(value_runtime[0]);
	            String generatelowercasevalue= generatelowercase.toLowerCase();      
	            webdriver.storeruntime(value_runtime[1], generatelowercasevalue);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }*/

	public StringBuilder readfile(String filepath) {
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(filepath))) {
			String line;
			while ((line = br.readLine()) != null) {
				stringBuilder.append(line);
				stringBuilder.append(System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return stringBuilder;

	}

	/* public boolean verifydownloadfilename(String filename) {
	    String downloadsDirectory = webdriver.getUserPreference("download.path");
	        File downloadsDir = new File(downloadsDirectory);
	        File[] files = downloadsDir.listFiles();

	        if (files != null) {
	             Arrays.sort(files, Comparator.comparingLong(File::lastModified).reversed());
	            for (File file : files) {
	                if (file.getName().toLowerCase().contains(filename.toLowerCase())) {
	                    System.out.println(file.getAbsolutePath());
	                    return true;
	                } else {
	                    return false;
	                }
	            }
	            return true;
	        } else {
	            System.out.println("No files found in the downloads directory.");
	            return false;
	        }
	    }*/

	/*public boolean savejsonkey(String jsonstring, String key, String runtime) {
	    try {
	        int[] array = { 0, 1, 2 };
	        GeneralMethod obj = new GeneralMethod();
	        String[] value_runtime = obj.runtimeparameter(array);
	        Object jsonData = new JSONObject(jsonstring);
	        String[] keys = key.split("/");
	        for (int i = 0; i < keys.length; i++) {
	            if (jsonData instanceof JSONObject) {
	                JSONObject jsonObject = (JSONObject) jsonData;
	                if (jsonObject.has(keys[i])) {
	                    jsonData = jsonObject.get(keys[i]);
	                    if (keys.length - 1 == i) {
	                        System.out.println(keys[i]);
	                        webdriver.storeruntime(value_runtime[2], keys[i]);
	                    }
	                } else {
	                    return false;
	                }
	            } else if (jsonData instanceof JSONArray) {
	                JSONArray jsonArray = (JSONArray) jsonData;
	                int index;
	                try {
	                    index = Integer.parseInt(keys[i]);
	                } catch (Exception e) {
	                    return false;
	                }
	                if (index >= 0 && index < jsonArray.length()) {
	                    jsonData = jsonArray.get(index);
	                    if (keys.length - 1 == i) {
	                        System.out.println(keys[i]);
	                        webdriver.storeruntime(value_runtime[2], keys[i]);
	                    }
	                } else {
	                    return false;
	                }
	            } else {
	                return false;
	            }
	        }
	        return true;
	    } catch (Exception e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	    public static String generateRandomEmail() {
	        Random random = new Random();
	        String username = generateRandomString(8);
	        String domain = EMAIL_DOMAINS[random.nextInt(EMAIL_DOMAINS.length)];
	        return username + "@" + domain;
	    }

	    public static String generateRandomPhoneNumber() {
	        Random random = new Random();
	        String prefix = PHONE_NUMBER_PREFIXES[random.nextInt(PHONE_NUMBER_PREFIXES.length)];
	        String middle = String.format("%03d", random.nextInt(1000));
	        String end = String.format("%04d", random.nextInt(10000));
	        return prefix+"" + middle + "" + end;
	    }

	    private static String generateRandomString(int length) {
	        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
	        StringBuilder sb = new StringBuilder(length);
	        Random random = new Random();
	        for (int i = 0; i < length; i++) {
	            sb.append(characters.charAt(random.nextInt(characters.length())));
	        }
	        return sb.toString();
	    }

	   public boolean getotp(String host,String port,String user,String password,String database,String myvalue,String otpruntime1,String otpruntime2,String otpruntime3,String otpruntime4)
	   {

	       myvalue=webdriver.getruntimevalueifexist(myvalue);
	       String sqlSelectAllPersons = "SELECT otp FROM questrearch_uat.otps WHERE username = '"+myvalue+"' ORDER BY otp DESC LIMIT 1;";
	         String connectionUrl = "jdbc:mysql://"+host+"/"+database;

	        // try (Connection conn = DriverManager.getConnection(connectionUrl, "admin", "f0g0rnS1Z18Y3ovyTrEt"); 
	        try (Connection conn = DriverManager.getConnection(connectionUrl, user, password); 
	                 PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons); 
	                 ResultSet rs = ps.executeQuery()) {

	             if (rs.next()) {
	                    System.out.println(rs.getString(1));
	                }
	             System.out.println(rs.getString(1));
	             int first=Integer.parseInt(rs.getString(1))/1000%10;
	             int second=Integer.parseInt(rs.getString(1))/100%10;
	             int third=Integer.parseInt(rs.getString(1))/10%10;
	             int fourth=Integer.parseInt(rs.getString(1))%10;
	             webdriver.storeruntime(otpruntime1, String.valueOf(first));
	             webdriver.storeruntime(otpruntime2, String.valueOf(second));
	             webdriver.storeruntime(otpruntime3, String.valueOf(third));
	             webdriver.storeruntime(otpruntime4, String.valueOf(fourth));
	             return true;
	         } catch (SQLException e) {
	             // handle the exception
	            return false;
	         }

	   }

	  /* public boolean  randomemailornumber(String opt,String runvalue)
	   {
	       String myvalue="";
	           if(opt.equalsIgnoreCase("email"))
	           {
	               myvalue=   generateRandomEmail();
	           }
	           else if(opt.equalsIgnoreCase("number"))
	           {
	               myvalue=   generateRandomPhoneNumber();
	           }
	           else
	           {

	              return false; 
	           }

	        androiddriver.storeruntime(runvalue, myvalue);
	        return true;
	       }*/


	/*public boolean incrementminutes(String mystring,String days,String minutes,String store)
	{
		try {     
			LocalDateTime currentDateTime = LocalDateTime.now();
			// Define the format you want
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern(mystring);
			// Format the date and time
			String formattedDateTime = currentDateTime.format(formatter);
			// Print the formatted date and time
			System.out.println("Current Date and Time: " + formattedDateTime);
			String minutesInput = "2";
			// Convert the input string to an integer
			int minutesToAdd = Integer.parseInt(minutes);
			LocalDateTime incrementedDateTime=currentDateTime.plusDays(Integer.parseInt(days));
			// Increment the current date and time by the specified minutes
			incrementedDateTime = incrementedDateTime.plusMinutes(minutesToAdd);
			// Format the incremented date and time
			String formattedIncrementedDateTime = incrementedDateTime.format(formatter);
			// Print the incremented date and time
			System.out.println("Date and Time after incrementing " + minutesToAdd + " minutes: " + formattedIncrementedDateTime);
			webdriver.storeruntime(store, formattedIncrementedDateTime);
			return true;
		} catch (Exception e) {
			//TODO: handle exception
			return false;
		}
	}*/

	public boolean enterusingrobo() {
		try {
			Robot robot = new Robot();
			System.out.println();
			robot.keyPress(17);
			Thread.sleep(1000L);
			robot.keyPress(86);
			Thread.sleep(1000L);
			robot.keyRelease(86);
			Thread.sleep(1000L);
			robot.keyRelease(17);
		} catch (Exception e) {
			return false;
		} 
		return true;
	}

	/* public boolean dynamicnotexits(String value) {
	        try {
	            String xpath = ((JsonNode) (sqaobject.getwebobjects()).curObject.getAttributes().get(0)).get("value")
	                    .asText();
	            String mypath = xpath.replaceAll("#replace", value);
	            JSONArray a = webdriver.findElements("xpath", mypath);
	            if (a.length() == 0)
	                return true;
	            return false;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public boolean entertextdynamically(String valuetoreplace, String valuetoenter) {
	        try {
	            String xpath = ((JsonNode) (sqaobject.getwebobjects()).curObject.getAttributes().get(0)).get("value")
	                    .asText();
	            String mypath = xpath.replaceAll("#replace", valuetoreplace);
	            sqaobject.getwebobjects().entertext("xpath", mypath, valuetoenter);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public boolean hoverelementdynamically(String valuetoreplace) {
	        try {
	            String xpath = ((JsonNode) (sqaobject.getwebobjects()).curObject.getAttributes().get(0)).get("value")
	                    .asText();
	            String mypath = xpath.replaceAll("#replace", valuetoreplace);
	            sqaobject.getwebobjects().movetoelement("xpath", mypath);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public boolean rightclickdynamically(String valuetoreplace) {
	        try {
	            String xpath = ((JsonNode) (sqaobject.getwebobjects()).curObject.getAttributes().get(0)).get("value")
	                    .asText();
	            String mypath = xpath.replaceAll("#replace", valuetoreplace);
	            sqaobject.getwebobjects().rightclick("xpath", mypath);
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }

	    public boolean elementsizefinder(String param) {
	        try {
	            String myxpath = ((JsonNode) (sqaobject.getwebobjects()).curObject.getAttributes().get(0)).get("value")
	                    .asText();
	            int mysize = 0;
	            JSONArray a = webdriver.findElements("xpath", myxpath);
	            webdriver.storeruntime(param, String.valueOf(a.length()));
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }*/

	public List<String> convert_string_list(String param1) {
		String stringData = param1.substring(1, param1.length() - 1);
		String[] resultArray = stringData.split(", ");
		List<String> resultList = Arrays.asList(resultArray);
		System.out.println(resultList);
		return resultList;
	}

	/*public boolean comparelist(String param1, String param2) throws Exception {
		try {
			List<String> resultList = convert_string_list(webdriver.getruntimevalueifexist(param1));
			Thread.sleep(100L);
			List<String> resultList2 = convert_string_list(webdriver.getruntimevalueifexist(param2));
			Thread.sleep(100L);
			if (resultList.containsAll(resultList2) && resultList2.containsAll(resultList))
				return true;
			return false;
		} catch (Exception e) {
			return false;
		}
	}*/

	/* public boolean storelist(String Param, String Param2) {
	        String myvalue1 = Param;
	        String myvalue2 = Param2;
	        String myxpath = ((JsonNode) (sqaobject.getwebobjects()).curObject.getAttributes().get(0)).get("value")
	                .asText();
	        int i = 0;
	        int j = 0;
	        int index = 0;
	        try {
	            int mysize = 0;
	            int elementsize = 0;
	            JSONArray a = webdriver.findElements("xpath", myxpath);
	            int oldlength = a.length();
	            while (true) {
	                Thread.sleep(300L);
	                webdriver.scrollIntoView("xpath",
	                        String.valueOf(String.valueOf(String.valueOf(myxpath))) + "[" + a.length() + "]");
	                sqaobject.getwebobjects().scrollIntoview("xpath",
	                        String.valueOf(String.valueOf(String.valueOf(myxpath))) + "[" + a.length() + "]");
	                sqaobject.getwebobjects().movetoelement("xpath",
	                        String.valueOf(String.valueOf(String.valueOf(myxpath))) + "[" + a.length() + "]");
	                webdriver.movetoelement("xpath",
	                        String.valueOf(String.valueOf(String.valueOf(myxpath))) + "[" + a.length() + "]");
	                sqaobject.getwebobjects().moveToElement("listElement19");
	                Thread.sleep(300L);
	                a = webdriver.findElements("xpath", myxpath);
	                if (a.length() == oldlength) {
	                    elementsize = oldlength;
	                    break;
	                }
	                oldlength = a.length();
	                elementsize = a.length();
	            }
	            List<String> mystring = new ArrayList<>();
	            Thread.sleep(1000L);
	            for (i = 1; i <= elementsize; i++) {
	                if (i % 30 == 0 || i % 19 == 0 || i % 26 == 0)
	                    webdriver.scrollIntoView("xpath",
	                            String.valueOf(String.valueOf(String.valueOf(myxpath))) + "[" + i + "]");
	                if (i <= elementsize) {
	                    a = webdriver.findElements("xpath", myxpath);
	                    elementsize = a.length();
	                    Param = null;
	                    webdriver.readtextandstore("xpath",
	                            String.valueOf(String.valueOf(String.valueOf(myxpath))) + "[" + i + "]", Param2);
	                    Param = webdriver.getruntimevalueifexist(myvalue2);
	                    mystring.add(Param);
	                }
	            }
	            webdriver.storeruntime(Param2, mystring.toString());
	            return true;
	        } catch (Exception e) {
	            return false;
	        }
	    }*/

	/*public boolean sortbasedondate(String param,String mytype)
	{
		String[] splitdata=null;
		String[] splitdata2=null;
		int index1=0;
		int index2=0;
		JSONArray weeks=null;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true)
		{
			if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
			{   
				break;
			}
		}
		while(true)
		{
			if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
			{
				if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
				{
					break;
				}

			}
		}
		if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
		{
			return true;
		}
		String mylength="";
		try {
			webdriver.readtextandstore("xpath", "//a[@aria-current='page']", param);
			String myvalue=webdriver.getruntimevalueifexist(param);
			for(int i=0;i<myvalue.length();i++)
			{
				if(myvalue.charAt(i)=='(')
				{
					for(int j=i+1;i<myvalue.length();j++)
					{
						if(myvalue.charAt(j)==')')
						{
							break;
						}
						mylength+=myvalue.charAt(j);
					}

					break;
				}
			}
			int pass=0;
			int fulllen=Integer.parseInt(mylength);
			int variable=0;
			int oldlength=0;
			while(true)
			{
				Thread.sleep(1000);
				variable+=12;
				int mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
				oldlength=mylen;
				if(mylen<=fulllen)
				{
					oldlength=mylen;
					webdriver.executeScript2("var arr;var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue;  }  element.scrollIntoView()");
					//  sqaobject.getwebobjects().movetoelement("xpath", "(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]") ;
					Thread.sleep(500);
					while(true)
					{
						if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
						{
							break;
						}

					}
					Thread.sleep(500);
					mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
					if(mylen==oldlength)
					{
						pass++;
						Thread.sleep(1000);
					}
					if(pass>10)
					{
						break; //this is for a case if the application gets stuck
					}
				}
				else{
					break;
				}
			}

		} catch (Exception e) {

		} while(true)
		{
			if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
			{
				if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
				{
					break;
				}

			}
		}
		try {
			JSONObject myvalues=webdriver.executeScript2("function getstatesvalidate() { var Parentxpath = 'html/body/app-root/app-lms-container/div/div/app-jobs/section[2]/div/app-all-jobs-tab/div/div/div[2]/div[2]/div'; var resultofparent = document.evaluate(Parentxpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var childrensize = resultofparent.singleNodeValue; var arr = []; for(let i=1;i<=childrensize.children.length;i++){var xpath = '(//*[@class=\"post-date\"])['+i+']'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue; arr.push(element.textContent); }  } console.log(arr); return arr; } return getstatesvalidate();");
			JSONArray myvalue=(JSONArray) myvalues.get("value");
			String[] arr1={"second","seconds","minute","minutes","hour","hours","day","days","week","weeks","month","months","year","years"};
			if(mytype.equalsIgnoreCase("asc")){
				for(int i=0;i<myvalue.length();i++)
				{
					if(i<myvalue.length()-1)
					{
						splitdata=myvalue.getString(i).split(" ");
						for(int j=0;j<arr1.length;j++)
						{
							if(splitdata[2].equalsIgnoreCase(arr1[j]))
							{
								index1=j;
							}
						}
						splitdata2=myvalue.getString(i+1).split(" ");
						for(int k=0;k<arr1.length;k++)
						{
							if(splitdata2[2].equalsIgnoreCase(arr1[k]))
							{
								index2=k;
							}
						}

					}
					if(index1==index2)
					{
						if(Integer.parseInt(splitdata[1])<=Integer.parseInt(splitdata2[1]))
						{

						}
						else{
							return false;
						}
					}
					if(index1<=index2)
					{

					}
					else{
						return false;
					}

				}
			}
			else if(mytype.equalsIgnoreCase("desc"))
			{



				for(int i=0;i<myvalue.length();i++)
				{
					if(i<myvalue.length()-1)
					{
						splitdata=myvalue.getString(i).split(" ");
						for(int j=0;j<arr1.length;j++)
						{
							if(splitdata[2].equalsIgnoreCase(arr1[j]))
							{
								index1=j;
							}
						}
						splitdata2=myvalue.getString(i+1).split(" ");
						for(int k=0;k<arr1.length;k++)
						{
							if(splitdata2[2].equalsIgnoreCase(arr1[k]))
							{
								index2=k;
							}
						}

					}
					if(index1==index2)
					{
						if(Integer.parseInt(splitdata[1])>=Integer.parseInt(splitdata2[1]))
						{

						}
						else{
							return false;
						}
					}
					if(index1>=index2)
					{

					}
					else{
						return false;
					}

				}


			}
			return true;
		} catch (Exception e) {
			return false;
			//TODO: handle exception
		}
	}



	public boolean sortbasedonprogressbar(String mysorttype2)
	{
		String mysorttype=mysorttype2;
		try {

			if(mysorttype.equalsIgnoreCase("asc"))
			{
				JSONObject  myvalues=webdriver.executeScript2("function progressbar() {var a1=document.getElementsByClassName(\"p-progressbar p-component p-progressbar-determinate\"); var parent =document.getElementsByClassName(\"mat-card mat-focus-indicator\"); var size=parent.length; var arr=[]; for( i=0;i<size;i++){  arr.push(a1[i].getAttribute('aria-valuenow')); } return arr;} return progressbar();");
				JSONArray myvalue=(JSONArray) myvalues.get("value");
				for(int i=0;i<myvalue.length();i++)
				{
					if(i<myvalue.length()-1 ){

						if(Double.parseDouble( myvalue.getString(i))<=Double.parseDouble( myvalue.getString(i+1)) )
						{
							System.out.println();

						}
						else{
							return false;
						}
					}
				}
			}
			else{
				JSONObject  myvalues=webdriver.executeScript2("function progressbar() {var a1=document.getElementsByClassName(\"p-progressbar p-component p-progressbar-determinate\"); var parent =document.getElementsByClassName(\"mat-card mat-focus-indicator\"); var size=parent.length; var arr=[]; for( i=0;i<size;i++){  arr.push(a1[i].getAttribute('aria-valuenow')); } return arr;} return progressbar();");
				JSONArray myvalue=(JSONArray) myvalues.get("value");
				for(int i=0;i<myvalue.length();i++)
				{
					if(i<myvalue.length()-1 ){

						if(Double.parseDouble( myvalue.getString(i))>=Double.parseDouble( myvalue.getString(i+1)) )
						{
							System.out.println();

						}
						else{
							return false;
						}
					}
				}
			}


			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public boolean validateindustrysector(String statename1,String equalsname1,String param)
	{
		//CustomMethods my=new CustomMethods();
		String statename=statename1;
		String equalsname[]=equalsname1.split(",");
		JSONObject myvalues=null;
		try {

			Thread.sleep(5000);

			while(true)
			{

				if(webdriver.findElements("xpath", "//mat-panel-title[contains(text(),'Industry Sector')]").length()>0)
				{
					webdriver.clickusingjs("xpath", "//mat-panel-title[contains(text(),'Industry Sector')]");
					Thread.sleep(5000);

					break;
				}
			}


			Thread.sleep(3000);
			while(true)
			{
				if(webdriver.findElements("xpath", "(//label[contains(text(),'"+statename+"')])[1]").length()>0)
				{
					webdriver.click("xpath", "(//label[contains(text(),'"+statename+"')])[1]");
					break;
				}
			}

			Thread.sleep(3000);
			while(true)
			{
				if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
				{
					if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
					{
						break;
					}

				}
			}
			//scroll

			while(true)
			{
				if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
				{
					if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
					{
						break;
					}
					break;
				}
			}

			Thread.sleep(6000);
			if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
			{
				return true;
			}
			String mylength="";
			try {
				webdriver.readtextandstore("xpath", "//a[@aria-current='page']", param);
				String myvalue=webdriver.getruntimevalueifexist(param);

				for(int i=0;i<myvalue.length();i++)
				{

					if(myvalue.charAt(i)=='(')
					{
						for(int j=i+1;i<myvalue.length();j++)
						{
							if(myvalue.charAt(j)==')')
							{
								break;
							}
							mylength+=myvalue.charAt(j);

						}

						break;
					}

				}
				int pass=0;
				int fulllen=Integer.parseInt(mylength);
				int variable=0;
				int oldlength=0;
				while(true)
				{
					Thread.sleep(1000);
					variable+=12;
					int mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
					oldlength=mylen;
					if(mylen<=fulllen)
					{
						oldlength=mylen;
						webdriver.executeScript2("var arr;var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue;  }  element.scrollIntoView()");
						//  sqaobject.getwebobjects().movetoelement("xpath", "(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]") ;
						Thread.sleep(500);
						while(true)
						{
							if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
							{
								break;
							}

						}
						Thread.sleep(500);

						mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
						if(mylen==oldlength)
						{
							pass++;
							Thread.sleep(1000);
						}
						if(pass>5)
						{
							break; //this is for a case if the application gets stuck
						}
					}
					else{
						break;
					}
				}

			} catch (Exception e) {

			}
			//
			myvalues=   webdriver.executeScript2("function validateindus() { var Parentxpath = 'html/body/app-root/app-lms-container/div/div/app-jobs/section[2]/div/app-all-jobs-tab/div/div/div[2]/div[2]/div'; var resultofparent = document.evaluate(Parentxpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var childrensize = resultofparent.singleNodeValue; var arr = []; for(let i=1;i<=childrensize.children.length;i++){var xpath = '(//div[contains(text(),\"Industry\")]/following::span[1])['+i+']'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue; arr.push(element.textContent); }  } console.log(arr); return arr; } return validateindus();");

			JSONArray myvalue=(JSONArray) myvalues.get("value");
			for(int i=0;i<myvalue.length();i++)
			{

				if(i<myvalue.length()-1 ){
					boolean mybooleanfound=false;
					for(int val=0;val<equalsname.length;val++)
					{
						if(myvalue.getString(i).equalsIgnoreCase(equalsname[val]) )
						{
							mybooleanfound=true;
						}


					}
					if(!mybooleanfound)
					{
						return false;
					}
				}

			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}


	public boolean validatestates(String validatewhat,String statename1,String equalsname1,String param)
	{
		//CustomMethods my=new CustomMethods();
		String statename=statename1;
		String equalsname[]=equalsname1.split(",");
		JSONObject myvalues=null;
		try {

			Thread.sleep(5000);

			while(true)
			{

				if(webdriver.findElements("xpath", "//mat-panel-title[contains(text(),'"+validatewhat+"')]").length()>0)
				{
					webdriver.clickusingjs("xpath", "//mat-panel-title[contains(text(),'"+validatewhat+"')]");
					Thread.sleep(5000);

					break;
				}
			}



			while(true)
			{
				if(webdriver.findElements("xpath", "//label[contains(text(),'"+statename+"')]").length()>0)
				{
					webdriver.clickusingjs("xpath", "//label[contains(text(),'"+statename+"')]");
					break;
				}
			}

			Thread.sleep(3000);
			while(true)
			{
				if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
				{
					if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
					{
						break;
					}

				}
			}
			//scroll

			while(true)
			{
				if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
				{
					if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
					{
						break;
					}
					break;
				}
			}

			Thread.sleep(6000);
			if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
			{
				return true;
			}
			String mylength="";
			try {
				webdriver.readtextandstore("xpath", "//a[@aria-current='page']", param);
				String myvalue=webdriver.getruntimevalueifexist(param);

				for(int i=0;i<myvalue.length();i++)
				{

					if(myvalue.charAt(i)=='(')
					{
						for(int j=i+1;i<myvalue.length();j++)
						{
							if(myvalue.charAt(j)==')')
							{
								break;
							}
							mylength+=myvalue.charAt(j);

						}

						break;
					}

				}
				int pass=0;
				int fulllen=Integer.parseInt(mylength);
				int variable=0;
				int oldlength=0;
				while(true)
				{
					Thread.sleep(1000);
					variable+=12;
					int mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
					oldlength=mylen;
					if(mylen<=fulllen)
					{
						oldlength=mylen;
						webdriver.executeScript2("var arr;var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue;  }  element.scrollIntoView()");
						//  sqaobject.getwebobjects().movetoelement("xpath", "(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]") ;
						Thread.sleep(500);
						while(true)
						{
							if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
							{
								break;
							}

						}
						Thread.sleep(500);

						mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
						if(mylen==oldlength)
						{
							pass++;
							Thread.sleep(1000);
						}
						if(pass>5)
						{
							break; //this is for a case if the application gets stuck
						}
					}
					else{
						break;
					}
				}

			} catch (Exception e) {

			}
			//
			myvalues=   webdriver.executeScript2("function getstatesvalidate() { var Parentxpath = 'html/body/app-root/app-lms-container/div/div/app-jobs/section[2]/div/app-all-jobs-tab/div/div/div[2]/div[2]/div'; var resultofparent = document.evaluate(Parentxpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var childrensize = resultofparent.singleNodeValue; var arr = []; for(let i=1;i<=childrensize.children.length;i++){var xpath = '(//div[contains(text(),\"Location\")]/following::span[1])['+i+']'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue; arr.push(element.textContent); }  } console.log(arr); return arr; } return getstatesvalidate();");

			JSONArray myvalue=(JSONArray) myvalues.get("value");
			for(int i=0;i<myvalue.length();i++)
			{

				if(i<myvalue.length()-1 ){
					boolean mybooleanfound=false;
					for(int val=0;val<equalsname.length;val++)
					{
						if(myvalue.getString(i).equalsIgnoreCase(equalsname[val]) )
						{
							mybooleanfound=true;
						}


					}
					if(!mybooleanfound)
					{
						return false;
					}
				}

			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	//validatesalary
	public boolean validatesalary(String param,String option)
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true)
		{
			if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
			{

				break;
			}

		}
		String value[]=null;
		//0-5000
		String myoption=option;
		int small=0;
		int big=0;
		try {

			String mysalarybutton="//span//mat-panel-title[contains(text(),'Salary')]";
			if(webdriver.findElements("xpath", mysalarybutton).length()>0)
			{
				webdriver.clickusingjs("xpath", mysalarybutton);
			}
			Thread.sleep(6000);
			if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
			{
				return true;
			}
			String xpath = webdriver.getCurrentObject().getAttributes().get(0).get("value").asText();

			String mypath = xpath.replaceAll("#replace", myoption);
			webdriver.clickusingjs("xpath", mypath);
			Thread.sleep(6000);
			if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
			{
				return true;
			}
			if(myoption.contains("+"))
			{
				value= option.split("\\+");
				while(true)
				{
					if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
					{
						if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
						{
							break;
						}

					}
				}


			}else{
				value=myoption.split("-");
				small=Integer.parseInt(value[0]);
				big=Integer.parseInt(value[1]);
			}
			while(true)
			{
				if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
				{
					if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
					{
						break;
					}
					break;
				}
			}
			Thread.sleep(6000);
			if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
			{
				return true;
			}
			String mylength="";
			//scroll action
			try {
				webdriver.readtextandstore("xpath", "//a[@aria-current='page']", param);
				String myvalue=webdriver.getruntimevalueifexist(param);

				for(int i=0;i<myvalue.length();i++)
				{

					if(myvalue.charAt(i)=='(')
					{
						for(int j=i+1;i<myvalue.length();j++)
						{
							if(myvalue.charAt(j)==')')
							{
								break;
							}
							mylength+=myvalue.charAt(j);

						}

						break;
					}

				}
				int pass=0;
				int fulllen=Integer.parseInt(mylength);
				int variable=0;
				int oldlength=0;
				while(true)
				{
					Thread.sleep(1000);
					variable+=12;
					int mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
					oldlength=mylen;
					if(mylen<=fulllen)
					{
						oldlength=mylen;
						webdriver.executeScript2("var arr;var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue;  }  element.scrollIntoView()");
						//  sqaobject.getwebobjects().movetoelement("xpath", "(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]") ;
						Thread.sleep(500);
						while(true)
						{
							if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
							{
								break;
							}

						}
						Thread.sleep(500);

						mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
						if(mylen==oldlength)
						{
							pass++;
							Thread.sleep(1000);
						}
						if(pass>10)
						{
							break; //this is for a case if the application gets stuck
						}
					}
					else{
						break;
					}
				}

			} catch (Exception e) {
				return false;
			}


			JSONObject myobj=  webdriver.executeScript2(" function myarr() { var Parentxpath = 'html/body/app-root/app-lms-container/div/div/app-jobs/section[2]/div/app-all-jobs-tab/div/div/div[2]/div[2]/div'; var resultofparent = document.evaluate(Parentxpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var childrensize = resultofparent.singleNodeValue; var arr = []; for(let i=1;i<=childrensize.children.length;i++){var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)['+i+']'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue; arr.push(element.textContent); }  } console.log(arr); return arr; } return myarr();");

			JSONArray myvalue=(JSONArray) myobj.get("value");

			for(int i=0;i<myvalue.length();i++)
			{
				if(myoption.contains("+"))
				{
					if(myvalue.getInt(i)>=Integer.parseInt(value[0]))
					{

					}
					else{
						return false;
					}
				}
				else{
					if(myvalue.getInt(i)>=small && myvalue.getInt(i)<=big )
					{

					}
					else{
						return false;
					}
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	//scrolltill the bottom
	public boolean scrolltilllastcard(String param)
	{
		while(true)
		{
			if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
			{
				if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
				{
					break;
				}

			}
		}
		String mylength="";
		try {
			webdriver.readtextandstore("xpath", "//a[@aria-current='page']", param);
			String myvalue=webdriver.getruntimevalueifexist(param);

			for(int i=0;i<myvalue.length();i++)
			{

				if(myvalue.charAt(i)=='(')
				{
					for(int j=i+1;i<myvalue.length();j++)
					{
						if(myvalue.charAt(j)==')')
						{
							break;
						}
						mylength+=myvalue.charAt(j);

					}

					break;
				}

			}
			int pass=0;
			int fulllen=Integer.parseInt(mylength);
			int variable=0;
			int oldlength=0;
			while(true)
			{
				Thread.sleep(1000);
				variable+=12;
				int mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
				oldlength=mylen;
				if(mylen<=fulllen)
				{
					oldlength=mylen;
					webdriver.executeScript2("var arr;var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue;  }  element.scrollIntoView()");
					//  sqaobject.getwebobjects().movetoelement("xpath", "(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]") ;
					Thread.sleep(500);
					while(true)
					{
						if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
						{
							break;
						}

					}
					Thread.sleep(500);

					mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
					if(mylen==oldlength)
					{
						pass++;
						Thread.sleep(1000);
					}
					if(pass>10)
					{
						break; //this is for a case if the application gets stuck
					}
				}
				else{
					break;
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	//sort salary functionality
	public boolean sortsalary(String param,String sorttype1)
	{
		String sorttype=sorttype1;
		// String type="number";

		while(true)
		{
			if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
			{
				if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
				{
					break;
				}

			}
		}
		try {
			Thread.sleep(6000);
			if(webdriver.findElements("xpath", "//*[contains(text(),'Sorry! We could not find any matching jobs.')]").length()>0)
			{
				return true;
			}
		} catch (Exception e) {

		}
		String mylength="";
		try {
			webdriver.readtextandstore("xpath", "//a[@aria-current='page']", param);
			String myvalue=webdriver.getruntimevalueifexist(param);

			for(int i=0;i<myvalue.length();i++)
			{

				if(myvalue.charAt(i)=='(')
				{
					for(int j=i+1;i<myvalue.length();j++)
					{
						if(myvalue.charAt(j)==')')
						{
							break;
						}
						mylength+=myvalue.charAt(j);

					}

					break;
				}

			}
			int pass=0;
			int fulllen=Integer.parseInt(mylength);
			int variable=0;
			int oldlength=0;
			while(true)
			{
				Thread.sleep(1000);
				variable+=12;
				int mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
				oldlength=mylen;
				if(mylen<=fulllen)
				{
					oldlength=mylen;
					webdriver.executeScript2("var arr;var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue;  }  element.scrollIntoView()");
					//  sqaobject.getwebobjects().movetoelement("xpath", "(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)["+variable+"]") ;
					Thread.sleep(500);
					while(true)
					{
						if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
						{
							break;
						}

					}
					Thread.sleep(500);

					mylen=webdriver.findElements("xpath", "//*[@class='mat-card mat-focus-indicator content-card jobs-card']").length() ;   
					if(mylen==oldlength)
					{
						pass++;
						Thread.sleep(1000);
					}
					if(pass>10)
					{
						break; //this is for a case if the application gets stuck
					}
				}
				else{
					break;
				}
			}
			// return true;
		} catch (Exception e) {
			//  return false;
		}
		while(true)
		{
			if(webdriver.findElements("xpath", "//a[@aria-current='page']").length()>0)
			{
				if(webdriver.findElements("xpath", "//mat-progress-bar[@class='mat-progress-bar mat-primary ng-star-inserted']").length()==0)
				{
					break;
				}

			}

		}
		try {
			JSONObject myobj=  webdriver.executeScript2(" function myarr() { var Parentxpath = 'html/body/app-root/app-lms-container/div/div/app-jobs/section[2]/div/app-all-jobs-tab/div/div/div[2]/div[2]/div'; var resultofparent = document.evaluate(Parentxpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var childrensize = resultofparent.singleNodeValue; var arr = []; for(let i=1;i<=childrensize.children.length;i++){var xpath = '(//div[@class=\"details\"]/div/div[contains(text(),\"Expected\")]//following-sibling::div)['+i+']'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); if (result.singleNodeValue) { var element = result.singleNodeValue; arr.push(element.textContent); }  } console.log(arr); return arr; } return myarr();");
			JSONArray myvalue=(JSONArray) myobj.get("value");

			if(sorttype.equalsIgnoreCase("asc")){
				for(int i=0;i<myvalue.length();i++)
				{
					if(i<myvalue.length()-1 ){

						if( myvalue.getInt(i)<=myvalue.getInt(i+1) )
						{


						}
						else{
							return false;
						}
					}
				}
			}
			if(sorttype.equalsIgnoreCase("desc")){
				for(int i=0;i<myvalue.length();i++)
				{
					if(i<myvalue.length()-1 ){
						if( myvalue.getInt(i)>=myvalue.getInt(i+1))
						{
						}
						else{
							return false;
						}
					}
				}
			}





			return true;
		} catch (Exception e) {
			//TODO: handle exception
			return false;
		}
	}
	public boolean getelementattributeandvalidate(String myatrrkey,String checkequalvalue){
		try {
			String myxpath=null;
			int mysize=webdriver.getCurrentObject().getAttributes().size();
			for(int i=0;i<mysize;i++)
			{

				if(webdriver.getCurrentObject().getAttributes().get(i).get("name").asText().equalsIgnoreCase("xpath")){




					myxpath=webdriver.getCurrentObject().getAttributes().get(i).get("value").asText();
					if(webdriver.findElements("xpath", myxpath).length()==1)
					{
						String myattrval=webdriver.getattribute("xpath", myxpath, myatrrkey);
						// System.out.println("my value"+myattrval) ;
						if(myattrval.equalsIgnoreCase(checkequalvalue))
						{
							// System.out.println("Passed and present");
							return true;
						}
					}
					else{
						return false;
					}
				}
				else{

				}         
			}
			return false;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed due to exception");
			return false;
		}
	}
	public String getObjectProperty(String ppt) {
		try {

			for (JsonNode attr : webdriver.getCurrentObject().getAttributes()) {
				if (attr.get("name").asText().toLowerCase().equals(ppt)) {
					return attr.get("value").asText();
				}
			}
			webdriver.logger.info("no ppt found with " + ppt + " in current obj");
			return null;
		} catch (Exception e) {
			return null;
		}
	}
	
//	String sessionId = webdriver.getwebDriver().getSessionId();
	
	public boolean uploadfileaction(String xpathvalue, String value) {
		String hostAddress = null;
		String clickelementId = null;
		String sessionId = webdriver.getwebDriver().getSessionId();
		try {
			hostAddress = webdriver.getwebDriver().getActionManger().getHostAddress();
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("content-type", "application/json");
			String host = String.valueOf(String.valueOf(String.valueOf(String.valueOf(hostAddress)))) + "/session/"
					+ this.sessionId + "/elements";
			JSONObject param = new JSONObject();
			param.put("using", "xpath");
			param.put("value", xpathvalue);
			JSONObject res = HttpUtility.sendPost(host, param.toString(), headers);
			System.out.println(res);
			if (res.getJSONArray("value") != null) {
				JSONArray elementsarr = res.getJSONArray("value");
				JSONObject elements = null;
				if (elementsarr.length() != 0 && elementsarr.length() <= 1)
					elements = elementsarr.getJSONObject(0);
				else {
					return false;
				}
				Iterator<String> iterator = elements.keys();
				String key = null;
				if (elements.length() == 1) {
					while (iterator.hasNext()) {
						key = iterator.next();
					}
					clickelementId = elements.getString(key);
				}
			}
			webdriver.elementSendkeys(clickelementId, value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}*/
	
	String month;
	String year;
	String day;
	String monthAbbreviation;
	String monthAbbreviationUppercase;

	/*public boolean enterdob(String dob) throws ParseException {
		boolean bstatus = false;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date date = dateFormat.parse(dob);
			if (dob.equals(dateFormat.format(date))) {
				this.month = (new SimpleDateFormat("MM")).format(date);
				int intMonth = Integer.parseInt(this.month);
				this.monthAbbreviation = (new SimpleDateFormat("MMM")).format(date);
				this.monthAbbreviationUppercase = this.monthAbbreviation.toUpperCase();
				this.day = (new SimpleDateFormat("dd")).format(date);
				this.year = (new SimpleDateFormat("yyyy")).format(date);
				System.out.println("Valid date");
				String xpath = getObjectProperty("xpath");
				xpath = xpath.replaceAll("'", "\"");
				String response = "var yearstatus = false; var monthstatus = false; var datestatus = false; var xpath = '"
						+ xpath
						+ "'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var element = result.singleNodeValue; while (element && !datestatus) { element.children[0].children[0].children[0].children[0].click(); var split1 = element.children[0].children[0].children[0].children[0].textContent; console.log(split1); split1 = split1.split(' '); console.log(split1); var elementlength = element.children[0].children[0].children[0].children.length; console.log(elementlength); if ("
						+ this.year
						+ " < Number(split1[0])) { let Backwardindex = elementlength - 2; var backwardElement = element.children[0].children[0].children[0].children[Backwardindex].disabled; if (backwardElement) { console.log('Disabled backward button'); break; } else { element.children[0].children[0].children[0].children[Backwardindex].click(); } } else if ("
						+ this.year
						+ " > Number(split1[1])) { let Forwardindex = elementlength - 1; var forwardElement = element.children[0].children[0].children[0].children[Forwardindex].disabled; if (forwardElement) { console.log('Disabled forward button'); break; } else { element.children[0].children[0].children[0].children[Forwardindex].click(); } } else if ("
						+ this.year + " <= Number(split1[1]) || " + this.year
						+ " >= Number(split1[0])) { console.log('second else'); for (var elementrow of element.children[1].children[0].children[0].children[1].children) { for (var subelements of elementrow.children) { if ("
						+ this.year
						+ " == subelements.textContent.trim()) { subelements.click(); yearstatus = true; break; } } } if (yearstatus) { var monthElement; for (var elementrow of element.children[1].children[0].children[0].children[1].children) { for (var subelements of elementrow.children) { if ('"
						+ this.monthAbbreviationUppercase
						+ "' == subelements.textContent.trim()) { monthElement = subelements.ariaDisabled; if (monthElement) { console.log('Disabled month'); return false; } else { subelements.click(); monthstatus = true; console.log('performed month click'); break; } } } if (monthstatus || monthElement) { break; } } console.log('before if fun'); if (monthstatus) { console.log('inside if fun'); for (var elementrow of element.children[1].children[0].children[0].children[1].children) { console.log('inside if fun - first for'); for (var subelements of elementrow.children) { if ("
						+ this.day
						+ " == subelements.textContent.trim()) { var dateElement = subelements.ariaDisabled; if (dateElement) { console.log('Disabled date'); return false; } else { subelements.click(); datestatus = true; break; } } } } } } else { console.log('wrong data'); continue; } } else { console.log('Input field not found.'); } } if (datestatus) { console.log('date selected successfully'); return true; } else { console.log('unable to select the date'); return false; }";
				JSONObject j = webdriver.executeScript2(response);
				boolean ref = j.has("value") ? j.getBoolean("value") : false;
				if (ref) {
					bstatus = true;
				} else {
					bstatus = false;
				}
			} else {
				System.out.println("Invalid date");
				bstatus = false;
			}
		} catch (Exception e) {
			bstatus = false;
		}
		return bstatus;
	}*/
	
	/*public boolean validatemandatoryfield() {
		boolean bstatus = false;
		try {
			String xpath = getObjectProperty("xpath");
			String keyvalue = webdriver.getattribute("xpath", xpath, "class");
			if (keyvalue.contains("required")) {
				bstatus = true;
			} else {
				bstatus = false;
			}
		} catch (Exception e) {
			bstatus = false;
		}
		return bstatus;
	}*/
	
	/*public boolean validateduplicateindropdown() {
		boolean bstatus = false;
		try {
			String xpath = getObjectProperty("xpath");
			xpath = xpath.replaceAll("'", "\"");
			String res = "var xpath = '" + xpath
					+ "'; var result = document.evaluate(xpath, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null); var element = result.singleNodeValue; if (element) { var children = element.children; let uniqueElements = new Set(); for(var child of children){ uniqueElements.add(child.textContent); } if(uniqueElements.size==children.length){ return true; }else{ return false; } } else { return false; }";
			JSONObject j = webdriver.executeScript2(res);
			boolean ref = j.has("value") ? j.getBoolean("value") : false;
			if (ref) {
				bstatus = true;
			} else {
				bstatus = false;
			}
		} catch (Exception e) {
			bstatus = false;
		}

		return bstatus;
	}*/
	
	/*public boolean checktogglebutton(String text)
	{
		if(webdriver.findElements("xpath", "(//div[@class='content']//table//tbody//tr//td)[1]").length()>0){
			webdriver.readtextandstore("xpath", "(//div[@class='content']//table//tbody//tr//td)[1]", text);
		}
		String mytext=webdriver.getruntimevalueifexist(text);
		String myxpath="(//tbody//tr//td[contains(text(),'"+mytext+"')]//parent::tr//child::td[4]//mat-slide-toggle[@class='mat-slide-toggle mat-accent mat-checked'])[1]";
		try {
			int mysize=webdriver.getCurrentObject().getAttributes().size();
			for(int i=0;i<mysize;i++)
			{ 
				if(webdriver.findElements("xpath", myxpath).length()==1){
					return true;
				}
				else{
					return false;
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}*/


}
