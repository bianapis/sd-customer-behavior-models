/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Design;

@BianRestController
public class CustomerBehaviorModelsApiController {

	@Autowired
	CustomerBehaviorModelsApiService service;
	
	@Design.Record
	public BianResponse<RecordCustomerBehaviorModelSpecificationResponsePayload> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordCustomerBehaviorModelSpecificationRequestPayload> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deployments")
	@Design.RequestPost
	public BianResponse<CustomerBehaviorModelsDeploymentBaseWithIdAndRoot> requestPostDeployments(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CustomerBehaviorModelsDeploymentBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPostDeployments(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("deployments")
	@Design.RequestPut
	public BianResponse<CustomerBehaviorModelsDeploymentBaseWithIdAndRoot> requestPutDeployments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerBehaviorModelsDeploymentBase> bianRequest) {
		return BianResponse.forSuccess(service.requestPutDeployments(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Design.Retrieve
	public BianResponse<RetrieveCustomerBehaviorModelResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Design.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Design.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("compliances")
	@Design.Retrieve
	public BianResponse<CustomerBehaviorModelsComplianceBaseWithIdAndRoot> retrieveCompliances(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCompliances(crReferenceId, bqReferenceId));
	}
	
	@BQ("deployments")
	@Design.Retrieve
	public BianResponse<CustomerBehaviorModelsDeploymentBaseWithIdAndRoot> retrieveDeployments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDeployments(crReferenceId, bqReferenceId));
	}
	
	@BQ("designs")
	@Design.Retrieve
	public BianResponse<CustomerBehaviorModelsDesignBaseWithIdAndRoot> retrieveDesigns(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDesigns(crReferenceId, bqReferenceId));
	}
	
	@BQ("implementations")
	@Design.Retrieve
	public BianResponse<CustomerBehaviorModelsImplementationBaseWithIdAndRoot> retrieveImplementations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveImplementations(crReferenceId, bqReferenceId));
	}
	
	@BQ("records")
	@Design.Retrieve
	public BianResponse<CustomerBehaviorModelsRecordBaseWithIdAndRoot> retrieveRecords(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRecords(crReferenceId, bqReferenceId));
	}
	
	@Design.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("testings")
	@Design.Retrieve
	public BianResponse<CustomerBehaviorModelsTestingBaseWithIdAndRoot> retrieveTestings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveTestings(crReferenceId, bqReferenceId));
	}
	
	@BQ("designs")
	@Design.Update
	public BianResponse<CustomerBehaviorModelsDesignBaseWithIdAndRoot> updateDesigns(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CustomerBehaviorModelsDesignBase> bianRequest) {
		return BianResponse.forSuccess(service.updateDesigns(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
