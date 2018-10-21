/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerBehaviorModelsApiService {

	RecordCustomerBehaviorModelSpecificationResponsePayload record(String crReferenceId, RecordCustomerBehaviorModelSpecificationRequestPayload request);
	
	CustomerBehaviorModelsDeploymentBaseWithIdAndRoot requestPostDeployments(String crReferenceId, CustomerBehaviorModelsDeploymentBase request);
	
	CustomerBehaviorModelsDeploymentBaseWithIdAndRoot requestPutDeployments(String crReferenceId, String bqReferenceId, CustomerBehaviorModelsDeploymentBase request);
	
	RetrieveCustomerBehaviorModelResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	CustomerBehaviorModelsComplianceBaseWithIdAndRoot retrieveCompliances(String crReferenceId, String bqReferenceId);
	
	CustomerBehaviorModelsDeploymentBaseWithIdAndRoot retrieveDeployments(String crReferenceId, String bqReferenceId);
	
	CustomerBehaviorModelsDesignBaseWithIdAndRoot retrieveDesigns(String crReferenceId, String bqReferenceId);
	
	CustomerBehaviorModelsImplementationBaseWithIdAndRoot retrieveImplementations(String crReferenceId, String bqReferenceId);
	
	CustomerBehaviorModelsRecordBaseWithIdAndRoot retrieveRecords(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds();
	
	CustomerBehaviorModelsTestingBaseWithIdAndRoot retrieveTestings(String crReferenceId, String bqReferenceId);
	
	CustomerBehaviorModelsDesignBaseWithIdAndRoot updateDesigns(String crReferenceId, String bqReferenceId, CustomerBehaviorModelsDesignBase request);
	
}
