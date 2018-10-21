/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerBehaviorModelsApiServiceImpl implements CustomerBehaviorModelsApiService {

	public RecordCustomerBehaviorModelSpecificationResponsePayload record(String crReferenceId, RecordCustomerBehaviorModelSpecificationRequestPayload request){
		return JsonReader.read("record-RecordCustomerBehaviorModelSpecificationResponsePayload.json",new TypeReference<RecordCustomerBehaviorModelSpecificationResponsePayload>(){});
	}
	
	public CustomerBehaviorModelsDeploymentBaseWithIdAndRoot requestPostDeployments(String crReferenceId, CustomerBehaviorModelsDeploymentBase request){
		return JsonReader.read("requestPost-CustomerBehaviorModelsDeploymentBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsDeploymentBaseWithIdAndRoot>(){});
	}
	
	public CustomerBehaviorModelsDeploymentBaseWithIdAndRoot requestPutDeployments(String crReferenceId, String bqReferenceId, CustomerBehaviorModelsDeploymentBase request){
		return JsonReader.read("requestPut-CustomerBehaviorModelsDeploymentBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsDeploymentBaseWithIdAndRoot>(){});
	}
	
	public RetrieveCustomerBehaviorModelResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-RetrieveCustomerBehaviorModelResponse.json",new TypeReference<RetrieveCustomerBehaviorModelResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerBehaviorModelsComplianceBaseWithIdAndRoot retrieveCompliances(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBehaviorModelsComplianceBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsComplianceBaseWithIdAndRoot>(){});
	}
	
	public CustomerBehaviorModelsDeploymentBaseWithIdAndRoot retrieveDeployments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBehaviorModelsDeploymentBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsDeploymentBaseWithIdAndRoot>(){});
	}
	
	public CustomerBehaviorModelsDesignBaseWithIdAndRoot retrieveDesigns(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBehaviorModelsDesignBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsDesignBaseWithIdAndRoot>(){});
	}
	
	public CustomerBehaviorModelsImplementationBaseWithIdAndRoot retrieveImplementations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBehaviorModelsImplementationBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsImplementationBaseWithIdAndRoot>(){});
	}
	
	public CustomerBehaviorModelsRecordBaseWithIdAndRoot retrieveRecords(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBehaviorModelsRecordBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsRecordBaseWithIdAndRoot>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CustomerBehaviorModelsTestingBaseWithIdAndRoot retrieveTestings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CustomerBehaviorModelsTestingBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsTestingBaseWithIdAndRoot>(){});
	}
	
	public CustomerBehaviorModelsDesignBaseWithIdAndRoot updateDesigns(String crReferenceId, String bqReferenceId, CustomerBehaviorModelsDesignBase request){
		return JsonReader.read("update-CustomerBehaviorModelsDesignBaseWithIdAndRoot.json",new TypeReference<CustomerBehaviorModelsDesignBaseWithIdAndRoot>(){});
	}
	
}
