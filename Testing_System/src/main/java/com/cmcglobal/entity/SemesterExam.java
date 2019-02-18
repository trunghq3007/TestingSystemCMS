package com.cmcglobal.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "semester_exam")
public class SemesterExam {
	@Id
	@Column(name = "semester_exam_id")
	@GeneratedValue(generator = "auto_increase")
	@GenericGenerator(name = "auto_increase", strategy = "com.cmcglobal.utils.AutoIncreaseId")
	private String id;
	@Column(name = "semester_exam_name")
	private String name;
	@Column(name = "semester_description")
	private String description;

	@ManyToOne
	@JoinColumn(name = "create_by", nullable = false)
	private User user;
    
	@Column(name = "status")
	private int status;
	@Column(name = "start_at")
	private Date startTime;
	@Column(name = "end_at")
	private Date endTime;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy="semesterExam")
	@JsonIgnoreProperties("semesterExam")
    private List<Candidate> candidates;
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	

	public List<Candidate> getCandidates() {
		return candidates;
	}

	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}

	@Override
	public String toString() {
		return this.id + " - " + this.name + " - " + this.description + " - " + this.user + " - " + this.startTime
				+ " - " + this.endTime;
	}
}