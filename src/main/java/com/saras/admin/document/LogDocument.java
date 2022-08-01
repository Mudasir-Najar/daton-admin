package com.saras.admin.document;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Document("ui_logs")
public class LogDocument{
	
	@Id
	private String id;
	private String created;
	private String data;
	private Long sourceId;
	private String tableName;
	private Long transactionId;
	private Long userId;

	@Override
	public String toString() {
		return "LogDocument [id=" + id + ", created=" + created + ", data=" + data + ", sourceid=" + sourceId
				+ ", tablename=" + tableName + ", trransctionid=" + transactionId + ", userid=" + userId + "]";
	}

	}

	









