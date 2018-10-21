package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CustomerBehaviorModelsDesignBase
 */
public class CustomerBehaviorModelsDesignBase   {
  private Object customerBehaviorModelDesignTaskRecord = null;

  private String customerMarketDataServiceReference = null;

  private String customerMarketDataReference = null;

  private String productServiceActivityReportReference = null;

  private Object productServiceActivityReport = null;

  private String customerBehaviorModelType = null;

  private Object customerBehaviorModelUsage = null;

  private String customerBehaviorModelImpact = null;

  private Object customerBehaviorModelFeedbackRecord = null;

  private String customerBehaviorModelSpecification = null;

  private String customerBehaviorModelOperationalRequirements = null;

  private String customerBehaviorModelAllowedUsage = null;

  private String customerBehaviorModelUsageGuidelines = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: details/tracking the design activity 
   * @return customerBehaviorModelDesignTaskRecord
  **/

  public Object getCustomerBehaviorModelDesignTaskRecord() {
    return customerBehaviorModelDesignTaskRecord;
  }

  public void setCustomerBehaviorModelDesignTaskRecord(Object customerBehaviorModelDesignTaskRecord) {
    this.customerBehaviorModelDesignTaskRecord = customerBehaviorModelDesignTaskRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: service providers of example market research and production data 
   * @return customerMarketDataServiceReference
  **/

  public String getCustomerMarketDataServiceReference() {
    return customerMarketDataServiceReference;
  }

  public void setCustomerMarketDataServiceReference(String customerMarketDataServiceReference) {
    this.customerMarketDataServiceReference = customerMarketDataServiceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: example market research/production data file 
   * @return customerMarketDataReference
  **/

  public String getCustomerMarketDataReference() {
    return customerMarketDataReference;
  }

  public void setCustomerMarketDataReference(String customerMarketDataReference) {
    this.customerMarketDataReference = customerMarketDataReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: internal bank activity report - used for development 
   * @return productServiceActivityReportReference
  **/

  public String getProductServiceActivityReportReference() {
    return productServiceActivityReportReference;
  }

  public void setProductServiceActivityReportReference(String productServiceActivityReportReference) {
    this.productServiceActivityReportReference = productServiceActivityReportReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: data file/report of production activity 
   * @return productServiceActivityReport
  **/

  public Object getProductServiceActivityReport() {
    return productServiceActivityReport;
  }

  public void setProductServiceActivityReport(Object productServiceActivityReport) {
    this.productServiceActivityReport = productServiceActivityReport;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: records impact/accuracy of model insights 
   * @return customerBehaviorModelImpact
  **/

  public String getCustomerBehaviorModelImpact() {
    return customerBehaviorModelImpact;
  }

  public void setCustomerBehaviorModelImpact(String customerBehaviorModelImpact) {
    this.customerBehaviorModelImpact = customerBehaviorModelImpact;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: user provided feedback/suggestions 
   * @return customerBehaviorModelFeedbackRecord
  **/

  public Object getCustomerBehaviorModelFeedbackRecord() {
    return customerBehaviorModelFeedbackRecord;
  }

  public void setCustomerBehaviorModelFeedbackRecord(Object customerBehaviorModelFeedbackRecord) {
    this.customerBehaviorModelFeedbackRecord = customerBehaviorModelFeedbackRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: design - inputs, calculations, outputs 
   * @return customerBehaviorModelSpecification
  **/

  public String getCustomerBehaviorModelSpecification() {
    return customerBehaviorModelSpecification;
  }

  public void setCustomerBehaviorModelSpecification(String customerBehaviorModelSpecification) {
    this.customerBehaviorModelSpecification = customerBehaviorModelSpecification;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: defines operational and technical requirements 
   * @return customerBehaviorModelOperationalRequirements
  **/

  public String getCustomerBehaviorModelOperationalRequirements() {
    return customerBehaviorModelOperationalRequirements;
  }

  public void setCustomerBehaviorModelOperationalRequirements(String customerBehaviorModelOperationalRequirements) {
    this.customerBehaviorModelOperationalRequirements = customerBehaviorModelOperationalRequirements;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: defines when/where model can be used 
   * @return customerBehaviorModelAllowedUsage
  **/

  public String getCustomerBehaviorModelAllowedUsage() {
    return customerBehaviorModelAllowedUsage;
  }

  public void setCustomerBehaviorModelAllowedUsage(String customerBehaviorModelAllowedUsage) {
    this.customerBehaviorModelAllowedUsage = customerBehaviorModelAllowedUsage;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: guidance on usage and result interpretation 
   * @return customerBehaviorModelUsageGuidelines
  **/

  public String getCustomerBehaviorModelUsageGuidelines() {
    return customerBehaviorModelUsageGuidelines;
  }

  public void setCustomerBehaviorModelUsageGuidelines(String customerBehaviorModelUsageGuidelines) {
    this.customerBehaviorModelUsageGuidelines = customerBehaviorModelUsageGuidelines;
  }


}

