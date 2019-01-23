package org.maven.beans;

public class RoleDomain {
	private Integer roleId;
	private String roleName;
	private String roleLevel;
	private String description;
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleLevel() {
		return roleLevel;
	}
	public void setRoleLevel(String roleLevel) {
		this.roleLevel = roleLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "RoleDomain [roleId=" + roleId + ", roleName=" + roleName + ", roleLevel=" + roleLevel + ", description="
				+ description + "]";
	}
}
