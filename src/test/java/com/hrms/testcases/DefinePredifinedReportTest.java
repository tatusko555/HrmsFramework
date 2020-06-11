package com.hrms.testcases;

import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class DefinePredifinedReportTest extends CommonMethods {
	
	@Test
	public void defineReport() {
		
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.navigateToReports();
		wait(2);
		//waitForClickability(defReport.addReportBtn);
		click(defReport.addReportBtn);
		sendText(defReport.reportName,"report");
		
		selectDdValue(defReport.selectionCriteriaDD, "Employment Status");
		selectDdValue(defReport.selectedCriteriaIncludeDD, "Current Employees Only");
		selectDdValue(defReport.displayFieldGroupsDD, "Personal");
		wait(1);
		click(defReport.btnAddDisplayGroup);
		selectDdValue(defReport.displayFields, "Nationality");
		wait(1);
		click(defReport.btnAddDisplayField);
		click(defReport.displayGroupCheckBox);
		wait(1);
		click(defReport.saveBtn);
		
		
	}
	
	
	

}
