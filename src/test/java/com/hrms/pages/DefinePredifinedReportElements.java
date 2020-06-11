package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DefinePredifinedReportElements extends CommonMethods {

	@FindBy(id = "btnAdd")
	public WebElement addReportBtn;
	
	@FindBy(xpath = "//input[@id='report_report_name']")
	public WebElement reportName;
	
	@FindBy(id = "report_criteria_list")
	public WebElement selectionCriteriaDD;
	
	@FindBy(id = "btnAddConstraint")
	public WebElement selectCriteriaAddBtn;
	
	@FindBy(xpath = "//fieldset[@id='criteria_fieldset']//select")
	public WebElement selectedCriteriaIncludeDD;
	
	@FindBy(id = "report_display_groups")
	public WebElement displayFieldGroupsDD;
	
	@FindBy(id = "btnAddDisplayGroup")
	public WebElement btnAddDisplayGroup;
	
	@FindBy(id = "report_display_field_list")
	public WebElement displayFields;
	
	@FindBy(id = "btnAddDisplayField")
	public WebElement btnAddDisplayField;
	
	@FindBy(id = "display_group_1")
	public WebElement displayGroupCheckBox;
	
	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	public DefinePredifinedReportElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
