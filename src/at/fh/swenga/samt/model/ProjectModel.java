package at.fh.swenga.samt.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "Projects")
public class ProjectModel {

	@Id
	@Column(name = "UID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int uid;

	@Column(name = "PID")
	private int pid;

	@Column(nullable = false, length = 50)
	private String projectName;

	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date deadline;

	private Integer progress;
	private String course;
	private String user;

	@Column(name="isArchived", columnDefinition="boolean default false")
	private Boolean isArchived;

	@ManyToMany(mappedBy = "projects", fetch = FetchType.EAGER)
	private List<UserModel> users;

	@Version
	long version;

	public ProjectModel() {
		// TODO Auto-generated constructor stub
	}

	public ProjectModel(String projectName, Date deadline, Integer progress, String course, String user) {
		super();
		this.projectName = projectName;
		this.deadline = deadline;
		this.progress = progress;
		this.course = course;
		this.user = user;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getDeadline() {
		return deadline;
	}

	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}

	public Integer getProgress() {
		return progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Boolean getIsArchived() {
		return isArchived;
	}

	public void setIsArchived(Boolean isArchived) {
		this.isArchived = isArchived;
	}

	public List<UserModel> getUsers() {
		return users;
	}

	public void setUsers(List<UserModel> users) {
		this.users = users;
	}

	public void addUser(UserModel user) {
		if (users == null) {
			users = new ArrayList<UserModel>();
		}
		users.add(user);
	}

}
