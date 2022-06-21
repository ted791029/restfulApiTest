package com.api.restfulApiTest.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FOX_CPT_TITLE")
public class CptTitle {
	
	/**唯一碼**/
	@Id
	private Integer id;
	/**部門ID**/
	private String bu_id;
	/**報表ID**/
	private Integer report_id;
	/**語系ID**/
	private String language_id;
	/**名稱**/
	private String name;
	/**排序**/
	private String sort;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBu_id() {
		return bu_id;
	}

	public void setBu_id(String bu_id) {
		this.bu_id = bu_id;
	}

	public Integer getReport_id() {
		return report_id;
	}

	public void setReport_id(Integer report_id) {
		this.report_id = report_id;
	}

	public String getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(String language_id) {
		this.language_id = language_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
}
