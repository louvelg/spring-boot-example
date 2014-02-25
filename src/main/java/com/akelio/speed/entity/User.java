package com.akelio.speed.entity;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class User implements java.io.Serializable {

	private static final long	serialVersionUID	= 6019023593944113928L;
	private Long	userId;
	private String	login;
	private String	password;
	private String	firstName;
	private String	lastName;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(userId).toHashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) { return true; }
		if (!(obj instanceof User)) return false;
		return new EqualsBuilder().append(userId, ((User) obj).getUserId()).isEquals();
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(userId).append(login).toString();
	}
}
