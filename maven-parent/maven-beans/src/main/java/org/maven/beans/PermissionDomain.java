package org.maven.beans;

public class PermissionDomain {
	private Integer Id;
	private String name;
	private String permissionUrl;
	private String method;
	private String description;
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPermissionUrl() {
		return permissionUrl;
	}
	public void setPermissionUrl(String permissionUrl) {
		this.permissionUrl = permissionUrl;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "PermissionDomain [Id=" + Id + ", name=" + name + ", permissionUrl=" + permissionUrl + ", method="
				+ method + ", description=" + description + "]";
	}
}
