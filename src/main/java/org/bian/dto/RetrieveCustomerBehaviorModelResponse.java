package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RetrieveCustomerBehaviorModelResponse
 */
public class RetrieveCustomerBehaviorModelResponse   {
  private String customerBehaviorModelPortfolioReference = null;

  private Object customerBehaviorModelPortfolioRecord = null;

  private String customerBehaviorModelReference = null;

  private String customerBehaviorModelType = null;

  private String customerBehaviorModelPurpose = null;

  private String customerBehaviorModelStatus = null;

  private Object customerBehaviorModelUsage = null;

  private Object customerBehaviorModelImpact = null;

  private Object customerBehaviorModelBudget = null;

  private String customerBehaviorModelVersion = null;

  private Object customerBehaviorModel = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier 
   * @return customerBehaviorModelPortfolioReference
  **/

  public String getCustomerBehaviorModelPortfolioReference() {
    return customerBehaviorModelPortfolioReference;
  }

  public void setCustomerBehaviorModelPortfolioReference(String customerBehaviorModelPortfolioReference) {
    this.customerBehaviorModelPortfolioReference = customerBehaviorModelPortfolioReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: record of all models usage and performance statistics 
   * @return customerBehaviorModelPortfolioRecord
  **/

  public Object getCustomerBehaviorModelPortfolioRecord() {
    return customerBehaviorModelPortfolioRecord;
  }

  public void setCustomerBehaviorModelPortfolioRecord(Object customerBehaviorModelPortfolioRecord) {
    this.customerBehaviorModelPortfolioRecord = customerBehaviorModelPortfolioRecord;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: defines analysis/insights provided 
   * @return customerBehaviorModelPurpose
  **/

  public String getCustomerBehaviorModelPurpose() {
    return customerBehaviorModelPurpose;
  }

  public void setCustomerBehaviorModelPurpose(String customerBehaviorModelPurpose) {
    this.customerBehaviorModelPurpose = customerBehaviorModelPurpose;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModelStatus
  **/

  public String getCustomerBehaviorModelStatus() {
    return customerBehaviorModelStatus;
  }

  public void setCustomerBehaviorModelStatus(String customerBehaviorModelStatus) {
    this.customerBehaviorModelStatus = customerBehaviorModelStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: records number of production deployments and frequency of execution 
   * @return customerBehaviorModelUsage
  **/

  public Object getCustomerBehaviorModelUsage() {
    return customerBehaviorModelUsage;
  }

  public void setCustomerBehaviorModelUsage(Object customerBehaviorModelUsage) {
    this.customerBehaviorModelUsage = customerBehaviorModelUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: records impact/accuracy of model insights 
   * @return customerBehaviorModelImpact
  **/

  public Object getCustomerBehaviorModelImpact() {
    return customerBehaviorModelImpact;
  }

  public void setCustomerBehaviorModelImpact(Object customerBehaviorModelImpact) {
    this.customerBehaviorModelImpact = customerBehaviorModelImpact;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: records time/effort on design/development by version/date 
   * @return customerBehaviorModelBudget
  **/

  public Object getCustomerBehaviorModelBudget() {
    return customerBehaviorModelBudget;
  }

  public void setCustomerBehaviorModelBudget(Object customerBehaviorModelBudget) {
    this.customerBehaviorModelBudget = customerBehaviorModelBudget;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: release version of available model 
   * @return customerBehaviorModelVersion
  **/

  public String getCustomerBehaviorModelVersion() {
    return customerBehaviorModelVersion;
  }

  public void setCustomerBehaviorModelVersion(String customerBehaviorModelVersion) {
    this.customerBehaviorModelVersion = customerBehaviorModelVersion;
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


}

