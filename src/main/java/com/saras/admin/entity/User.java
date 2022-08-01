package com.saras.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="_user")
public class User {
	@Id
	@Column
	private long userid;
	@Column
	private String email;
	@Column
	private String fristName;
	@Column
	private String lastName;
	@Column(name = "companyid")
	private long companyId;
	@Column
	private long status;
	@Column
	private long role;
	@Column
	private long created;
	@Column
	private long updated;
	@Column
	private String timeZone;
	@Column
	private String uId;
	@Column
	private String restoreid;
	@Override
	public String toString() {
		return "User [userid=" + userid + ", email=" + email + ", fristName=" + fristName + ", lastName=" + lastName
				+ ", companyid=" + companyId + ", status=" + status + ", role=" + role + ", created=" + created
				+ ", updated=" + updated + ", timeZone=" + timeZone + ", uId=" + uId + ", restoreid=" + restoreid + "]";
	}

	

}
