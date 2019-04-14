package net.citrite.pip.sfdc;

import java.io.Serializable;

@org.kie.api.definition.type.Label("Tag")
public class Tag implements Serializable {

	private static final long serialVersionUID = -6150082296946535613L;
	
	@org.kie.api.definition.type.Label("Tag ID")
	private String TagID;
	@org.kie.api.definition.type.Label("Tag Name")
	private String TagName;

	public String getTagID() {
		return this.TagID;
	}

	public void setTagID(String TagID) {
		this.TagID = TagID;
	}

	public String getTagName() {
		return this.TagName;
	}

	public void setTagName(String TagName) {
		this.TagName = TagName;
	}

	public Tag(String TagID, String TagName) {
		this.TagID = TagID;
		this.TagName = TagName;
	}

	public Tag() {
	}

}