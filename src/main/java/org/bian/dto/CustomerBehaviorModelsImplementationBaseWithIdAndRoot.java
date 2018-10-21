package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBehaviorModelsImplementationBaseWithIdAndRoot
 */
public class CustomerBehaviorModelsImplementationBaseWithIdAndRoot   {
  private String customerBehaviorModelReference = null;

  private Object customerBehaviorModel = null;

  private String customerBehaviorModelImplementationTaskReference = null;

  private Object customerBehaviorModelImplementationTaskRecord = null;

  private String customerBehaviorModelType = null;

  private String customerBehaviorModelDevelopmentTaskReference = null;

  private String customerBehaviorModelDevelopmentTaskDescription = null;

  private Object customerBehaviorModelDevelopmentTaskBudget = null;

  private String customerBehaviorModelDevelopmentTaskOrganization = null;

  private String customerBehaviorModelDevelopmentTaskStatus = null;

  private Object customerBehaviorModelDevelopmentTaskDeliverable = null;

  private String customerBehaviorModelStatus = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: reference to implementation activity 
   * @return customerBehaviorModelImplementationTaskReference
  **/

  public String getCustomerBehaviorModelImplementationTaskReference() {
    return customerBehaviorModelImplementationTaskReference;
  }

  public void setCustomerBehaviorModelImplementationTaskReference(String customerBehaviorModelImplementationTaskReference) {
    this.customerBehaviorModelImplementationTaskReference = customerBehaviorModelImplementationTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: details/tracking the implementation activity 
   * @return customerBehaviorModelImplementationTaskRecord
  **/

  public Object getCustomerBehaviorModelImplementationTaskRecord() {
    return customerBehaviorModelImplementationTaskRecord;
  }

  public void setCustomerBehaviorModelImplementationTaskRecord(Object customerBehaviorModelImplementationTaskRecord) {
    this.customerBehaviorModelImplementationTaskRecord = customerBehaviorModelImplementationTaskRecord;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the reference ID to the Customer Behavior Model Development Task 
   * @return customerBehaviorModelDevelopmentTaskReference
  **/

  public String getCustomerBehaviorModelDevelopmentTaskReference() {
    return customerBehaviorModelDevelopmentTaskReference;
  }

  public void setCustomerBehaviorModelDevelopmentTaskReference(String customerBehaviorModelDevelopmentTaskReference) {
    this.customerBehaviorModelDevelopmentTaskReference = customerBehaviorModelDevelopmentTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModelDevelopmentTaskDescription
  **/

  public String getCustomerBehaviorModelDevelopmentTaskDescription() {
    return customerBehaviorModelDevelopmentTaskDescription;
  }

  public void setCustomerBehaviorModelDevelopmentTaskDescription(String customerBehaviorModelDevelopmentTaskDescription) {
    this.customerBehaviorModelDevelopmentTaskDescription = customerBehaviorModelDevelopmentTaskDescription;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: planned and actual time and effort for the development task 
   * @return customerBehaviorModelDevelopmentTaskBudget
  **/

  public Object getCustomerBehaviorModelDevelopmentTaskBudget() {
    return customerBehaviorModelDevelopmentTaskBudget;
  }

  public void setCustomerBehaviorModelDevelopmentTaskBudget(Object customerBehaviorModelDevelopmentTaskBudget) {
    this.customerBehaviorModelDevelopmentTaskBudget = customerBehaviorModelDevelopmentTaskBudget;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModelDevelopmentTaskOrganization
  **/

  public String getCustomerBehaviorModelDevelopmentTaskOrganization() {
    return customerBehaviorModelDevelopmentTaskOrganization;
  }

  public void setCustomerBehaviorModelDevelopmentTaskOrganization(String customerBehaviorModelDevelopmentTaskOrganization) {
    this.customerBehaviorModelDevelopmentTaskOrganization = customerBehaviorModelDevelopmentTaskOrganization;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerBehaviorModelDevelopmentTaskStatus
  **/

  public String getCustomerBehaviorModelDevelopmentTaskStatus() {
    return customerBehaviorModelDevelopmentTaskStatus;
  }

  public void setCustomerBehaviorModelDevelopmentTaskStatus(String customerBehaviorModelDevelopmentTaskStatus) {
    this.customerBehaviorModelDevelopmentTaskStatus = customerBehaviorModelDevelopmentTaskStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerBehaviorModelDevelopmentTaskDeliverable
  **/

  public Object getCustomerBehaviorModelDevelopmentTaskDeliverable() {
    return customerBehaviorModelDevelopmentTaskDeliverable;
  }

  public void setCustomerBehaviorModelDevelopmentTaskDeliverable(Object customerBehaviorModelDevelopmentTaskDeliverable) {
    this.customerBehaviorModelDevelopmentTaskDeliverable = customerBehaviorModelDevelopmentTaskDeliverable;
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


}

