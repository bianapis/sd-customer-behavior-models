package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBehaviorModelsDeploymentBase
 */
public class CustomerBehaviorModelsDeploymentBase   {
  private Object customerBehaviorModel = null;

  private Object customerBehaviorModelDeploymentTaskRecord = null;

  private String employeeBusinessUnitReference = null;

  private String customerBehaviorModelVersion = null;

  private String customerBehaviorModelDeploymentStatus = null;

  private Object customerBehaviorModelUsage = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: details/tracking the deployment activity 
   * @return customerBehaviorModelDeploymentTaskRecord
  **/

  public Object getCustomerBehaviorModelDeploymentTaskRecord() {
    return customerBehaviorModelDeploymentTaskRecord;
  }

  public void setCustomerBehaviorModelDeploymentTaskRecord(Object customerBehaviorModelDeploymentTaskRecord) {
    this.customerBehaviorModelDeploymentTaskRecord = customerBehaviorModelDeploymentTaskRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: the unit requesting the deployment 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: tracks completion of deployment actions 
   * @return customerBehaviorModelDeploymentStatus
  **/

  public String getCustomerBehaviorModelDeploymentStatus() {
    return customerBehaviorModelDeploymentStatus;
  }

  public void setCustomerBehaviorModelDeploymentStatus(String customerBehaviorModelDeploymentStatus) {
    this.customerBehaviorModelDeploymentStatus = customerBehaviorModelDeploymentStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: records number of production deployments 
   * @return customerBehaviorModelUsage
  **/

  public Object getCustomerBehaviorModelUsage() {
    return customerBehaviorModelUsage;
  }

  public void setCustomerBehaviorModelUsage(Object customerBehaviorModelUsage) {
    this.customerBehaviorModelUsage = customerBehaviorModelUsage;
  }


}

