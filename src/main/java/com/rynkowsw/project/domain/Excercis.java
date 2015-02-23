package com.rynkowsw.project.domain;

import java.io.Serializable;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "excercises")
public class Excercis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "excercise_id", insertable = false, updatable = false, unique = true, nullable = false)
	private Integer excerciseId;

	@Column(nullable = false, length = 50)
	private String name;

	@Column(length = 400)
	private String description;

	@Column(name = "repeats")
	private Integer repeats;

	@Column(name = "series")
	private Integer series;

	@Column(name = "time")
	private Integer time;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	public Integer getExcerciseId() {
		return excerciseId;
	}

	public void setExcerciseId(Integer excerciseId) {
		this.excerciseId = excerciseId;
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

	public Integer getRepeats() {
		return repeats;
	}

	public void setRepeats(Integer repeats) {
		this.repeats = repeats;
	}

	public Integer getSeries() {
		return series;
	}

	public void setSeries(Integer series) {
		this.series = series;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}


	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}