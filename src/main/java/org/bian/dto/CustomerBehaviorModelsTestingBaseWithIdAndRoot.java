package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBehaviorModelsTestingBaseWithIdAndRoot
 */
public class CustomerBehaviorModelsTestingBaseWithIdAndRoot   {
  private String customerBehaviorModelReference = null;

  private Object customerBehaviorModel = null;

  private String customerBehaviorModelTestingTaskReference = null;

  private Object customerBehaviorModelTestingTaskRecord = null;

  private String customerBehaviorModelType = null;

  private String customerBehaviorModelTestReference = null;

  private String customerBehaviorModelTestType = null;

  private String customerBehaviorModelTestHarnessReference = null;

  private String customerBehaviorModelTestResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: The reference ID to this Customer Behavior Model Portfolio 
   * @return customerBehaviorModelReference
  **/

  public String getCustomerBehaviorModelReference() {
    return customerBehaviorModelReference;
  }

  public void setCustomerBehaviorModelReference(String customerBehaviorModelReference) {
    this.customerBehaviorModelReference = customerBehaviorModelReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: this is the executable model specificaion 
   * @return customerBehaviorModel
  **/

  public Object getCustomerBehaviorModel() {
    return customerBehaviorModel;
  }

  public void setCustomerBehaviorModel(Object customerBehaviorModel) {
    this.customerBehaviorModel = customerBehaviorModel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: reference to testing activity 
   * @return customerBehaviorModelTestingTaskReference
  **/

  public String getCustomerBehaviorModelTestingTaskReference() {
    return customerBehaviorModelTestingTaskReference;
  }

  public void setCustomerBehaviorModelTestingTaskReference(String customerBehaviorModelTestingTaskReference) {
    this.customerBehaviorModelTestingTaskReference = customerBehaviorModelTestingTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: details/tracking the testing activity 
   * @return customerBehaviorModelTestingTaskRecord
  **/

  public Object getCustomerBehaviorModelTestingTaskRecord() {
    return customerBehaviorModelTestingTaskRecord;
  }

  public void setCustomerBehaviorModelTestingTaskRecord(Object customerBehaviorModelTestingTaskRecord) {
    this.customerBehaviorModelTestingTaskRecord = customerBehaviorModelTestingTaskRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModelType
  **/

  public String getCustomerBehaviorModelType() {
    return customerBehaviorModelType;
  }

  public void setCustomerBehaviorModelType(String customerBehaviorModelType) {
    this.customerBehaviorModelType = customerBehaviorModelType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the reference ID to the Customer Behavior Model Test 
   * @return customerBehaviorModelTestReference
  **/

  public String getCustomerBehaviorModelTestReference() {
    return customerBehaviorModelTestReference;
  }

  public void setCustomerBehaviorModelTestReference(String customerBehaviorModelTestReference) {
    this.customerBehaviorModelTestReference = customerBehaviorModelTestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModelTestType
  **/

  public String getCustomerBehaviorModelTestType() {
    return customerBehaviorModelTestType;
  }

  public void setCustomerBehaviorModelTestType(String customerBehaviorModelTestType) {
    this.customerBehaviorModelTestType = customerBehaviorModelTestType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the testing environment 
   * @return customerBehaviorModelTestHarnessReference
  **/

  public String getCustomerBehaviorModelTestHarnessReference() {
    return customerBehaviorModelTestHarnessReference;
  }

  public void setCustomerBehaviorModelTestHarnessReference(String customerBehaviorModelTestHarnessReference) {
    this.customerBehaviorModelTestHarnessReference = customerBehaviorModelTestHarnessReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Indicator general-info: The result of the test. Errors result in further design/implementation 
   * @return customerBehaviorModelTestResult
  **/

  public String getCustomerBehaviorModelTestResult() {
    return customerBehaviorModelTestResult;
  }

  public void setCustomerBehaviorModelTestResult(String customerBehaviorModelTestResult) {
    this.customerBehaviorModelTestResult = customerBehaviorModelTestResult;
  }


}

