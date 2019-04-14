package net.citrite.pip.sfdc;

import java.io.Serializable;
import java.util.List;
import net.citrite.pip.salesforce.Specialization;
import net.citrite.pip.salesforce.AuthorizationItem;

public class Request implements Serializable {

	private static final long serialVersionUID = -1524280697031891812L;
	
	@org.kie.api.definition.type.Label(value = "Order")
	private Order Order;
	@org.kie.api.definition.type.Label(value = "Reward Registration")
	private RewardRegistration RewardRegistration;
	@org.kie.api.definition.type.Label(value = "Partner Info")
	private PartnerInfo PartnerInfo;
	@org.kie.api.definition.type.Label(value = "Partner Functions")
	private PartnerFunctions PartnerFunctions;
	@org.kie.api.definition.type.Label(value = "Original Order")
	private OriginalOrder OriginalOrder;
	@org.kie.api.definition.type.Label(value = "Sales Exceptions")
	private List<String> SalesExceptions;
	@org.kie.api.definition.type.Label(value = "Product Authorizations")
	private List<AuthorizationItem> ProductAuthorizations;
	@org.kie.api.definition.type.Label(value = "End User Info")
	private EndUserInfo EndUserInfo;
	@org.kie.api.definition.type.Label(value = "Specializations")
	private List<Specialization> Specializations;

	public Order getOrder() {
		return this.Order;
	}

	public void setOrder(Order Order) {
		this.Order = Order;
	}

	public RewardRegistration getRewardRegistration() {
		return this.RewardRegistration;
	}

	public void setRewardRegistration(RewardRegistration RewardRegistration) {
		this.RewardRegistration = RewardRegistration;
	}

	public PartnerInfo getPartnerInfo() {
		return this.PartnerInfo;
	}

	public void setPartnerInfo(PartnerInfo PartnerInfo) {
		this.PartnerInfo = PartnerInfo;
	}

	public PartnerFunctions getPartnerFunctions() {
		return this.PartnerFunctions;
	}

	public void setPartnerFunctions(PartnerFunctions PartnerFunctions) {
		this.PartnerFunctions = PartnerFunctions;
	}

	public OriginalOrder getOriginalOrder() {
		return this.OriginalOrder;
	}

	public void setOriginalOrder(OriginalOrder OriginalOrder) {
		this.OriginalOrder = OriginalOrder;
	}

	public List<String> getSalesExceptions() {
		return this.SalesExceptions;
	}

	public void setSalesExceptions(List<String> SalesExceptions) {
		this.SalesExceptions = SalesExceptions;
	}

	public List<AuthorizationItem> getProductAuthorizations() {
		return this.ProductAuthorizations;
	}

	public void setProductAuthorizations(List<AuthorizationItem> ProductAuthorizations) {
		this.ProductAuthorizations = ProductAuthorizations;
	}

	public EndUserInfo getEndUserInfo() {
		return this.EndUserInfo;
	}

	public void setEndUserInfo(EndUserInfo EndUserInfo) {
		this.EndUserInfo = EndUserInfo;
	}

	public List<Specialization> getSpecializations() {
		return this.Specializations;
	}

	public void setSpecializations(List<Specialization> Specializations) {
		this.Specializations = Specializations;
	}

	public Request(Order Order, RewardRegistration RewardRegistration, PartnerInfo PartnerInfo, PartnerFunctions PartnerFunctions, OriginalOrder OriginalOrder, List<String> SalesExceptions, List<AuthorizationItem> ProductAuthorizations, EndUserInfo EndUserInfo, List<Specialization> Specializations) {
		this.Order = Order;
		this.RewardRegistration = RewardRegistration;
		this.PartnerInfo = PartnerInfo;
		this.PartnerFunctions = PartnerFunctions;
		this.OriginalOrder = OriginalOrder;
		this.SalesExceptions = SalesExceptions;
		this.ProductAuthorizations = ProductAuthorizations;
		this.EndUserInfo = EndUserInfo;
		this.Specializations = Specializations;
	}

	public Request() {
	}

}
