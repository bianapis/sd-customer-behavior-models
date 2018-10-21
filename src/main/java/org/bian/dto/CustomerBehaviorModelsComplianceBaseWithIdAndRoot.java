package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBehaviorModelsComplianceBaseWithIdAndRoot
 */
public class CustomerBehaviorModelsComplianceBaseWithIdAndRoot   {
  private String customerBehaviorModelReference = null;

  private Object customerBehaviorModel = null;

  private String customerBehaviorModelComplianceTaskReference = null;

  private Object customerBehaviorModelComplianceTaskRecord = null;

  private String customerBehaviorModelType = null;

  private String complianceTestReference = null;

  private String complianceTestType = null;

  private Object complianceTestResult = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: reference to compliance checking activity 
   * @return customerBehaviorModelComplianceTaskReference
  **/

  public String getCustomerBehaviorModelComplianceTaskReference() {
    return customerBehaviorModelComplianceTaskReference;
  }

  public void setCustomerBehaviorModelComplianceTaskReference(String customerBehaviorModelComplianceTaskReference) {
    this.customerBehaviorModelComplianceTaskReference = customerBehaviorModelComplianceTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: details/tracking the compliance checking activity 
   * @return customerBehaviorModelComplianceTaskRecord
  **/

  public Object getCustomerBehaviorModelComplianceTaskRecord() {
    return customerBehaviorModelComplianceTaskRecord;
  }

  public void setCustomerBehaviorModelComplianceTaskRecord(Object customerBehaviorModelComplianceTaskRecord) {
    this.customerBehaviorModelComplianceTaskRecord = customerBehaviorModelComplianceTaskRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the reference ID to the Customer Behavior Model Compliance Test 
   * @return complianceTestReference
  **/

  public String getComplianceTestReference() {
    return complianceTestReference;
  }

  public void setComplianceTestReference(String complianceTestReference) {
    this.complianceTestReference = complianceTestReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return complianceTestType
  **/

  public String getComplianceTestType() {
    return complianceTestType;
  }

  public void setComplianceTestType(String complianceTestType) {
    this.complianceTestType = complianceTestType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: The result of the compliance test. Failure results in further design/development 
   * @return complianceTestResult
  **/

  public Object getComplianceTestResult() {
    return complianceTestResult;
  }

  public void setComplianceTestResult(Object complianceTestResult) {
    this.complianceTestResult = complianceTestResult;
  }


}

