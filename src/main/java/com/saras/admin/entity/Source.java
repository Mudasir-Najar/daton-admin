package com.saras.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Source {

	@Id
	@Column(name = "sourceid")
	private long sourceId;
	@Column(name = "userid")
	private long userId;
	@Column(name = "frequency")
	private String frequency;
	@Column(name = "history")
	private String history;
	@Column(name = "status")
	private long status;
	@Column(name = "setting")
	private String setting;
	@Column(name = "updated")
	private Long updated;
	@Column(name = "created")
	private long created;
	@Column(name = "name")
	private String name;
	@Column(name = "shopname")
	private String shopname;
	@Column(name = "type")
	private String type;
	@Column(name = "datasourceid")
	private long datasourceId;
	@Column(name = "sourceuid")
	private String sourceUId;
	@Column(name = "description")
	private String description;
	@Column(name = "descriptiontype")
	private String descriptiontype;
	@Column(name = "warehouseid")
	private long warehouseId;
	@Column(name = "parallelism")
	private int parallelism;
	@Column(name = "pre")
	private boolean pre;
	@Column(name = "trace")
	private boolean trace;
	@Column(name = "template")
	private boolean template;
	@Column(name = "sellername")
	private String sellername;
	@Column(name = "inprocess")
	private boolean inprocess;
	@Column(name = "cdksource")
	private boolean cdksource;
	@Column(name = "transactionhistory")
	private int transactionhistory;
	@Column(name = "enabletablescheduler")
	private boolean enabletablescheduler;
	@Column(name = "companyid")
	private int companyId;
	@Column(name = "templateid")
	private int templateId;

	@Override
	public String toString() {
		return "Source [sourceId=" + sourceId + ", userId=" + userId + ", frequency=" + frequency + ", history="
				+ history + ", status=" + status + ", setting=" + setting + ", updated=" + updated + ", created="
				+ created + ", name=" + name + ", shopname=" + shopname + ", type=" + type + ", datasourceId="
				+ datasourceId + ", sourceUId=" + sourceUId + ", description=" + description + ", descriptiontype="
				+ descriptiontype + ", warehouseId=" + warehouseId + ", parallelism=" + parallelism + ", pre=" + pre
				+ ", trace=" + trace + ", template=" + template + ", sellername=" + sellername + ", inprocess="
				+ inprocess + ", cdksource=" + cdksource + ", transationhistory=" + transactionhistory
				+ ", enabletablescheduler=" + enabletablescheduler + ", companyId=" + companyId + ", templateId="
				+ templateId + "]";
	}

}
